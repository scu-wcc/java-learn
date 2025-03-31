package scu.wcc.Internetdemo.exercise.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",18888);

        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("请输入消息: ");
            String str = sc.nextLine()+"\n";
            os.write(str.getBytes());

            if("886\n".equals(str)){
                os.close();
                break;
            }
        }

    }
}
