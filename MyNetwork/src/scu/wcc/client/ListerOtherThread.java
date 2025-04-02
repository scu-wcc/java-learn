package scu.wcc.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ListerOtherThread implements Runnable {
    private final Socket socket;
    private volatile boolean running = true; // 控制线程运行的标志

    public ListerOtherThread(Socket socket) {
        this.socket = socket;
    }

    public void stop() {
        running = false; // 设置标志为false以终止循环
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            while (running && !socket.isClosed()) { // 检查Socket是否关闭
                String otherMessage = br.readLine();
                if (otherMessage == null) {
                    // 服务器关闭了连接
                    System.out.println("服务器已断开");
                    break;
                }
                System.out.println(otherMessage);
            }
        } catch (IOException e) {
            if (running) { // 仅在未主动停止时打印异常
                System.err.println("监听线程异常: " + e.getMessage());
            }
        } finally {
            stop(); // 确保线程终止
        }
    }
}