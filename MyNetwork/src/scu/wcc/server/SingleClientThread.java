package scu.wcc.server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class SingleClientThread implements Runnable{

    //当前客户端的接口
    Socket socket;
    Properties prop;


    public SingleClientThread(Socket socket, Properties prop) {
        this.socket = socket;
        this.prop=prop;
    }

    @Override
    public void run() {
        try {
            BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));

            loop:while (true){
                String userChoose = br.readLine();
                switch (userChoose){
                    case "1" -> login(br,bw);
                    case "2" -> register(br,bw);
                    case "3" ->{
                        System.out.println("客户端已退出");
                        break loop;}

                }
            }
            socket.shutdownOutput();
            socket.shutdownInput();
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void register(BufferedReader br, BufferedWriter bw) throws IOException {
        String userInfo=br.readLine();

        String nameInput = userInfo.split("&")[0].split("=")[1];
        String passwordInput = userInfo.split("&")[1].split("=")[1];

        if(prop.containsKey(nameInput)){
            //"0"->当前用户名存在
            write2Client(bw,"0");
        }else{
            if(checkFormat(nameInput,passwordInput)){
                //"2" ->注册成功
                write2Client(bw,"2");
                prop.put(nameInput,passwordInput);
                FileWriter fw = new FileWriter(new File("MyNetwork/userInfo.txt"));
                prop.store(fw,"用户信息");
                Server.socketList.add(socket);
                Server.currentUsersList.add(nameInput);

                System.out.println("欢迎"+nameInput+"加入聊天室");
                while(true){
                    String message = br.readLine();
                    if ("exit".equals(message)){
                        Server.socketList.remove(socket);
                        Server.currentUsersList.remove(nameInput);
                        break;
                    }

                    System.out.println(nameInput+":"+message);
                    talk2All(nameInput+":"+message);


                }

            }else {
                //"1"->当前用户名或密码格式不正确
                write2Client(bw,"1");
            }

        }

    }

    private void login(BufferedReader br, BufferedWriter bw) throws IOException {
        String userInfo=br.readLine();

        String nameInput = userInfo.split("&")[0].split("=")[1];
        String passwordInput = userInfo.split("&")[1].split("=")[1];

        for (int i = 0; i < Server.currentUsersList.size(); i++) {
            String name = Server.currentUsersList.get(i);
            if(name.equals(nameInput)){
                //"3"->当前该用户已经登录
                write2Client(bw,"3");
                return;
            }
        }


        if(prop.containsKey(nameInput)){
            String password = (String)prop.get(nameInput);
            if(password.equals(passwordInput)){
                //"2"->登录成功
                write2Client(bw,"2");
                Server.socketList.add(socket);
                Server.currentUsersList.add(nameInput);

                System.out.println("欢迎"+nameInput+"加入聊天室");
                while(true){
                    String message = br.readLine();
                    if ("exit".equals(message)){
                        Server.socketList.remove(socket);
                        Server.currentUsersList.remove(nameInput);
                        break;
                    }

                    System.out.println(nameInput+":"+message);
                    talk2All(nameInput+":"+message);
                }

            }else{
                //"1"->当前用户名或密码错误
                write2Client(bw,"1");
            }

        }else {
            //返回"0"->当前用户不存在
            write2Client(bw,"0");
        }


    }

    private void talk2All(String s) throws IOException {
        ArrayList<Socket> sockets = Server.socketList;
        for (Socket otherSocket : sockets) {
            if(!otherSocket.equals(this.socket)){
                BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(otherSocket.getOutputStream()));
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
        }
    }

    private void write2Client(BufferedWriter bw, String message) throws IOException {
        bw.write(message);
        bw.newLine();
        bw.flush();
    }

    private boolean checkFormat(String name,String password){
        int nameLen =name.length();
        int passwordLen =password.length();
        if(nameLen>18 || nameLen<6 || passwordLen<3 || passwordLen>8){
            return false;
        }
        for (int i = 0; i < nameLen; i++) {
            char ch = name.charAt(i);
            if(!Character.isLetter(ch)){
                return false;
            }
        }

        for (int i = 0; i < passwordLen; i++) {
            if(i==0){
                char first = password.charAt(i);
                if(!Character.isLetter(first)){
                    return false;
                }
                continue;
            }
            char ch = password.charAt(i);
            if(ch<'0' || ch>'9'){
                return false;
            }

        }
        return true;
    }


}
