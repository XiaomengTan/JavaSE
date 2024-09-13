import java.io.*;

public class Case093BufferRAWCopyJavaFile {
    public static void main(String[] args) throws IOException {
        //此复制方式最常用
        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\Module083IOStreamOrFileRAW\\Test083CharacterSet.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\Module083IOStreamOrFileRAW\\OutputFile.java"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
