package Test132TxtToRecallThread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocker)
        ServerSocket ss = new ServerSocket(18417);

        while(true) {
            //监听客户端的连接。返回Socket对象
            Socket s = ss.accept();

            //为每个客户端开启一个线程
            new Thread(new ServerThread(s)).start();
        }
//        ss.close();
    }
}
