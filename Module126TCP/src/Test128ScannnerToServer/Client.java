package Test128ScannnerToServer;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.202.45.245", 18888);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }


//    public static void main(String[] args) throws IOException {
//        //创建客户端的Socket对象(Socket)
//        Socket s = new Socket("10.202.45.245", 18888);
//
//        //数据来自于键盘录入，直到输入的数据是886，发送数据结束
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //封装输出流对象
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
//        String line;
//        while ((line = br.readLine())!=null){
//            //如果数据是886，就结束输入
//            if("886".equals(line)){
//                break;
//            }
//            //获取输出流，写数据
////            OutputStream os = s.getOutputStream();
////            os.write(line.getBytes(StandardCharsets.UTF_8));
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//
//        //释放资源
//        s.close();
//    }
}
