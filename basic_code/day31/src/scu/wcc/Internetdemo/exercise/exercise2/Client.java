package scu.wcc.Internetdemo.exercise.exercise2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 12345);

        Scanner sc = new Scanner(System.in);
        String  str;

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        PrintWriter pw =new PrintWriter(osw);

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());


        while (true){
            System.out.println("请输入你的信息：");
            str = sc.nextLine();

            pw.println(str);
            pw.flush();

            if("886".equals(str)){
                break;
            }


            System.out.println("接收到服务器回复：");
            int b ;
            while((b = isr.read())!=-1){

                System.out.print((char) b);

            }
            System.out.println();

        }

        socket.close();

    }
}
