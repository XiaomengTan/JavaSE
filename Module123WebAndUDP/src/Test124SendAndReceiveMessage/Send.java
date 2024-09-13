package Test124SendAndReceiveMessage;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "hello,UDP,I am coming!".getBytes(StandardCharsets.UTF_8);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("10.202.45.245"),10086);
        ds.send(dp);
        ds.close();
    }



    /*public static void main(String[] args) throws IOException {
        //创建发送段的Socket对象(DatagramSocket)
        //DatagramSocket ()构造数据报套接字并将其绑定到本地主机的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        //创建数据并把数据打包
        //DatagramPocket (byte[] buf, int length, InetAddess addess, int port)
        //构造一个数据包，发送长度为length的数据包到指定主机上的指定端口号
        byte[] bys = "hello,UDP,I am coming!".getBytes(StandardCharsets.UTF_8);
//        int length = bys.length;
//        InetAddress address = InetAddress.getByName("10.202.0.24");
//        int port = 10086;
//        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("10.202.0.24"),10086);


        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p)从此套接字发送数据包
        ds.send(dp);

        //关闭发送端
        //void close() 关闭数据报套接字
        ds.close();
    }*/
    /*
        ds.send(dp);
        ds.send(dp);
     */

}
