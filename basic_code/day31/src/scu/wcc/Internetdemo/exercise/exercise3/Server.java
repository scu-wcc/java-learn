package scu.wcc.Internetdemo.exercise.exercise3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(12345);

        Socket socket = ss.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] arr = new byte[1024*1024*5] ;
        int len;

        String name = UUID.randomUUID().toString().replace("-","");
        BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("basic_code/day31/src/scu/wcc/Internetdemo/exercise/exercise3/serverdir/"+name+".mp4"));

        while((len = bis.read(arr)) !=-1){

            bos.write(arr,0,len);

        }

        bos.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        bw.write("接收成功！");
        bw.newLine();
        bw.flush();

        socket.close();
        ss.close();

    }
}
