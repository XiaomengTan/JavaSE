package Test127ClientToServerRecall;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象(Socket)
        Socket s = new Socket("10.202.0.24", 10000);

        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello,TCP,I am coming".getBytes(StandardCharsets.UTF_8));

        //接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端接收的反馈："+data);

        //释放资源
        s.close();
    }
}
