package Test126SocketAndSocketServe;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Cilent {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        //Socket(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
        Socket s = new Socket("10.202.0.24",10000);

        //获取输出流，写数据
        //getOutputStream() 返回此套接字的输出流。
        OutputStream os = s.getOutputStream();
        os.write("hello,TCP,I am coming".getBytes(StandardCharsets.UTF_8));

        //释放资源
        os.close();//Connection refused
    }
}
