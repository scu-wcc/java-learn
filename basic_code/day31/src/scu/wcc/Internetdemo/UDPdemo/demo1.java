package scu.wcc.Internetdemo.UDPdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress localhost = InetAddress.getByName("localhost");//host可以是当前主机名
        System.out.println(localhost);//localhost/127.0.0.1

        String ip = localhost.getHostAddress();
        System.out.println(ip);//127.0.0.1

        String name = localhost.getHostName();
        System.out.println(name);//localhost

    }
}
