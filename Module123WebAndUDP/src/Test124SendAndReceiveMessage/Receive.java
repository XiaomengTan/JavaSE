package Test124SendAndReceiveMessage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        ds.receive(dp);

        byte[] datas = dp.getData();
        int len = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println("数据是："+dataString);
        ds.close();
    }




   /* public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        //DatagramSocket (int port) 构造数据包套接字并将其绑定到本地主机上的指定端口
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用于接收数据
        //DatagramPacket (int port) 构造一个 DatagramPacket用于接收长度为 length数据包
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //解析数据包，并把数据在控制台显示
        byte[] datas = dp.getData();
        //int getLength () 返回要发送的数据的长度或接收到数据的长度
        int len = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println("数据是："+dataString);

        //关闭接收端
        ds.close();
    }
    *//*
        ds.receive(dp);
        dp.getData();
        dp.getLength();
        ds.close();
     */

}
