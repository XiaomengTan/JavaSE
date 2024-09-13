package Test125GetMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Send {
    public static void main(String[] args) throws IOException {
        //创建发送段的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!=null){
            //如果数据是886，就结束输入
            if("886".equals(line)){
                break;
            }
            //创建数据并把数据打包
            byte[] bys = line.getBytes(StandardCharsets.UTF_8);
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("10.202.0.24"),12345);

            //调用DatagramSocket对象的方法发送数据
            ds.send(dp);
        }
        //关闭发送端
        ds.close();
    }
}
