package scu.wcc.Internetdemo.exercise.exercise2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);

        Socket socket = ss.accept();

        Scanner sc = new Scanner(System.in);
        String  str;
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        PrintWriter pw =new PrintWriter(osw);

        while (true){
            System.out.println("收到客户端信息：");
            int b ;
            while((b = isr.read())!=-1){

                System.out.print((char) b);
            }
            //回写数据
            System.out.println();
            System.out.println("请输入你的信息：");
            str = sc.nextLine();

            pw.println(str);
            pw.flush();

            if("886".equals(str)){
                break;
            }


        }

        socket.close();
        ss.close();

    }



}
