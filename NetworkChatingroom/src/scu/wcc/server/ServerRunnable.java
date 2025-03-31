package scu.wcc.server;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

public class ServerRunnable implements Runnable{
    Socket socket;
    Properties prop;

    public ServerRunnable(Socket socket, Properties prop) {
        this.socket = socket;
        this.prop = prop;
    }

    @Override
    public void run() {

        try {
            BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while(true){
                String choose = br.readLine();
                switch (choose){
                    case "login"-> login(br);
                    case "register"-> register(br);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void register(BufferedReader br) throws IOException {
        System.out.println("用户选择了注册按钮");
        String userInfo = br.readLine();

        String nameInput = userInfo.split("&")[0].split("=")[1];
        String passwordInput =userInfo.split("&")[1].split("=")[1];

        if(prop.containsKey(nameInput)){
            //0：用户名已存在
            returnMessage2Client("0");
        }else{
            if(checkName(nameInput)){
                //检查密码
                if(checkPassword(passwordInput)){
                    //3：密码格式正确
                    returnMessage2Client("3");
                    BufferedWriter userBw =new BufferedWriter(new FileWriter(new File("NetworkChatingroom/userinfo.txt"),true));
                    userBw.write(nameInput+"="+passwordInput);
                    userBw.newLine();
                    userBw.flush();
                    userBw.close();


                    System.out.println(nameInput+"加入聊天室。");

                    Server.list.add(socket);
                    //开始聊天
                    talk2All(br,nameInput);

                }else{
                    //2：密码格式错误
                    returnMessage2Client("2");
                }


            }else{
                //1：用户名格式错误
                returnMessage2Client("1");
            }


        }


    }

    private void login(BufferedReader br) throws IOException {
        System.out.println("用户选择了登录按钮");
        String userInfo =br.readLine();
        String nameInput = userInfo.split("&")[0].split("=")[1];
        String passwordInput = userInfo.split("&")[1].split("=")[1];

        if(prop.containsKey(nameInput)){
            String password =(String) prop.get(nameInput);
            if(password.equals(passwordInput)){
                returnMessage2Client("1");
                System.out.println(nameInput+"加入聊天室。");

                Server.list.add(socket);
                //开始聊天
                talk2All(br,nameInput);

            }else{
                returnMessage2Client("2");

            }
        }else {
            returnMessage2Client("3");
        }


    }

    private void talk2All(BufferedReader br, String nameInput) throws IOException {
        while(true){
            String message = br.readLine();
            System.out.println(nameInput+": "+message);


            for (Socket socket : Server.list) {
                if(socket.equals(this.socket)){
                    continue;
                }else{
                    returnMessage2Client(socket,nameInput+": "+message);

                }
            }
        }


    }

    public void returnMessage2Client(String number) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(number);
        bw.newLine();
        bw.flush();

    }
    public void returnMessage2Client(Socket s ,String number) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write(number);
        bw.newLine();
        bw.flush();

    }


    public boolean checkName(String name){
        if(name.length()>18 ||name.length()<6){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(!Character.isLetter(ch)){
                return false;
            }

        }
        return true;
    }

    public boolean checkPassword(String password){
        for (int i = 0; i < password.length(); i++) {
            if(i==0){
                if(Character.isLetter(password.charAt(i))){
                    continue;
                }else{
                    return false;
                }
            }

            char ch = password.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;

    }
}
