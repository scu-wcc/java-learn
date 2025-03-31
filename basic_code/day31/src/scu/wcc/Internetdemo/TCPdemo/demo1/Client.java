package scu.wcc.Internetdemo.TCPdemo.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端连接，指定连接的服务器IP、端口
        //注意：创建对象的同时会连接服务器，连接不上就会报错。
        Socket s = new Socket("127.0.0.1",10000);

        //创建字节流输出
        OutputStream os = s.getOutputStream();

        //写出数据
        os.write("你好你好".getBytes());

        //关闭数据
        os.close();
        s.close();
    }
}
