import java.io.*;

public class Test113CopyMoredir {
    public static void main(String[] args) throws IOException {
        //创建数据源File对象
        File srcFile = new File("C:\\Users\\morea\\Desktop\\forfiletest02");

        //创建目的地File对象
        File destFile = new File("TestOfBili\\src\\TXTsort");

        //复制文件夹
        copyForder(srcFile, destFile);

    }

    //复制文件夹
    private static void copyForder(File srcFile, File destFile) throws IOException {
        //判断是否是目录
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            //封装
            File newFolder = new File(destFile, srcFileName);
            if(!newFolder.exists()){
                newFolder.mkdir();
            }

            //获取数据源文件所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();
            //遍历该File数组得到每一个对象
            assert fileArray != null;
            for(File file:fileArray){
                //把该File作为数据源File对象，递归调用复制文件的方法
                copyForder(file,newFolder);
            }
        } else {
            //说明是文件，直接用字节流复制
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    //复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bos.close();
    }
}
