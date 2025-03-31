package scu.wcc.Internetdemo.exercise.exercise4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(12345);

        ThreadPoolExecutor pools = new ThreadPoolExecutor(3,6,60,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        while(true){
            Socket socket = ss.accept();

            pools.submit(new MyRun(socket));


        }



    }
}
