package Test127ClientToServerRecall;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocker)
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept() 侦听要连接到此套接字并接受它。
        Socket s = ss.accept();

        //获取输入流，读数据，并把数据显示在控制台上
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器收到的数据是："+data);

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已收到".getBytes(StandardCharsets.UTF_8));

        //释放资源
        s.close();
    }
}
