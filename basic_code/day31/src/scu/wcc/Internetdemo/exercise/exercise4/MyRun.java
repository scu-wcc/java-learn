package scu.wcc.Internetdemo.exercise.exercise4;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRun implements  Runnable {

    Socket socket;

    public MyRun(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            byte[] arr = new byte[1024*1024*5] ;
            int len;

            String name = UUID.randomUUID().toString().replace("-","");
            BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("basic_code/day31/src/scu/wcc/Internetdemo/exercise/exercise4/serverdir/"+name+".mp4"));

            while((len = bis.read(arr)) !=-1){

                bos.write(arr,0,len);

            }

            bos.close();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bw.write("接收成功！");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }




    }
}
