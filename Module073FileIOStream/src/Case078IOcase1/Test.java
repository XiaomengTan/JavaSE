package Case078IOcase1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建输入输出流
        FileOutputStream fos = new FileOutputStream("TestOfBili\\src\\Module073FileIOStream\\Case078IOcase1\\Output.txt");
        FileInputStream fis = new FileInputStream("TestOfBili\\src\\Module073FileIOStream\\Case078IOcase1\\Input.txt");

        //读取Input.txt文件的数据，写入Output.txt文件
        int by;
        while ((by = fis.read())!=-1){
            fos.write(by);
        }

        //关流
        fos.close();
        fis.close();
    }
}
