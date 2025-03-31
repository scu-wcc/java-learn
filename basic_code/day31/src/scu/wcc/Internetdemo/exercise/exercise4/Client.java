package scu.wcc.Internetdemo.exercise.exercise4;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket =new Socket("127.0.0.1",12345);

        //读取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("basic_code/day31/src/scu/wcc/Internetdemo/exercise/exercise4/clientdir/furry1.mp4"));
        //写入服务器
        BufferedOutputStream bos =new BufferedOutputStream(socket.getOutputStream());

        byte[] arr = new byte[1024*1024];
        int len;

        while((len = bis.read(arr))!=-1){
            bos.write(arr,0,len);
        }

        socket.shutdownOutput();

        //接收服务器的返回信息
        BufferedReader br =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());

        socket.close();
        bis.close();
    }
}
