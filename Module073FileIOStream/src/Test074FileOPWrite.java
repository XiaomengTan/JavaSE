import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test074FileOPWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module073FileIOStream\\Output\\in.txt");
        /*
        public FileOutputStream(String name) throws FileNotFoundException {
            this(name != null ? new File(name) : null, false);//自动创建File对象
        }
         */
//        fos.write(97);//1
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

//        byte[] bys = {97,98,99,100,101};
        byte[] bytes = "hello,Java!".getBytes(StandardCharsets.UTF_8);//将字符串转换为字节数组
//        fos.write(bytes);//2

        fos.write(bytes,1,3);//3

        fos.close();
    }
}
