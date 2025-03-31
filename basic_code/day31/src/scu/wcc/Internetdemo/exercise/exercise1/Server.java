package scu.wcc.Internetdemo.exercise.exercise1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(18888);

        Socket socket = ss.accept();

        InputStream clientInput = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(clientInput);

        int b;
        while ((b= isr.read()) != -1) {
            System.out.print((char)b);
        }

        socket.close();
        ss.close();

    }
}
