import java.io.*;

public class Test112CopyFile {
    public static void main(String[] args) throws IOException{
        //创建数据源目录的File对象
        File srcForder = new File("C:\\Users\\morea\\Desktop\\forfiletest");

        //获取数据源目录File对象的名称
        String srcForderName = srcForder.getName();

        //创建目的地路径File对象
        File destForder = new File("TestOfBili\\src\\TXTsort",srcForderName);

        //判断目的地目录对应的File是否存在
        if(!destForder.exists()){
            destForder.mkdir();
        }

        //获取数据源目录下所有的文件的File数组
        File[] listFiles = srcForder.listFiles();

        //遍历数组，得到每一个File对象
        for(File srcFile : listFiles){
            //获取数据源文件File对象的名称
            String srcFileName = srcFile.getName();
            //创建目的地File对象，路径名是目的地+文件名
            File destFile = new File(destForder,srcFileName);
            //复制文件
            copyFile(srcFile,destFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos  =new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bos.close();
        bos.close();
    }
}
