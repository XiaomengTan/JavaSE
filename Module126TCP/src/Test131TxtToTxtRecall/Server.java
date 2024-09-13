package Test131TxtToTxtRecall;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象(ServerSocker)
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端的连接。返回Socket对象
        Socket s = ss.accept();

        //获取输入流，读数据，并把数据显示在控制台上
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\TXTsort\\Test135out.txt"));
        String line;
        while ((line = br.readLine())!=null) {//等待读取数据
//            if("886".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(11111);

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放资源
        bwServer.close();
        ss.close();
    }
}
