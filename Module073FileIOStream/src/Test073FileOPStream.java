import java.io.FileOutputStream;
import java.io.IOException;

public class Test073FileOPStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\morea\\Desktop\\File Transfer Station\\code\\Java\\JavaProjects\\TestOfBili\\src\\TXTsort\\Test73to76.txt");
        /*
        创建字节输出流对象做了三件事情：
            1.调用系统功能创建了文件
            2.创建了字节输出流对象
            3.让字节输出流对象指向创建好的文件
         */

        fos.write(97);
//        fos.write(57);
//        fos.write(55);//字符9跟7

        //最后要释放资源
        fos.close();
        /*
        调用close方法做了两件事情：
            1.关闭输出流
            2.释放与此流相关的任何系统资源
         */
    }
}
