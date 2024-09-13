import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test081BufferBasics {
    public static void main(String[] args) throws IOException {
        //创建字节输出流
//        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module081BufferIOStream\\in.txt");
//        //创建字节输出缓冲流
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
       /* BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("TestOfBili\\src\\Module081BufferIOStream\\in.txt"));
        //写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        //释放资源
        bos.close();*/

        //创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("TestOfBili\\src\\Module081BufferIOStream\\in.txt"));
        //写数据
        //一次一个字节
//        int by;
//        while ((by = bis.read())!=-1){
//            System.out.print((char) by);
//        }

        //一次一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        //释放资源
        bis.close();
    }
}
