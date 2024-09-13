import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Case80IOCasePictureCopy {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象，储存目的地
        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module073FileIOStream\\Test85IOcase03PictureCopy\\mc.jpg");
        //创建字节输入流对象，储存出发地
        FileInputStream fis = new FileInputStream("C:\\Users\\morea\\Desktop\\第二个皮肤.jpg");

        //读取数据，一次读取一个字节数组，一次写入一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
