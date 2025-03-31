package scu.wcc.Internetdemo.UDPdemo.chatroot;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        //聊天室发送端
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要说的话: ");
            String sentence = sc.nextLine();
            if("886".equals(sentence)){
                break;
            }

            InetAddress address = InetAddress.getByName("localhost");

            DatagramPacket dp = new DatagramPacket(sentence.getBytes(),sentence.getBytes().length, address, 18888);

            ds.send(dp);
        }

        ds.close();

    }
}
