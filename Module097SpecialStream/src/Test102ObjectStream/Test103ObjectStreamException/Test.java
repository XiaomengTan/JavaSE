package Test102ObjectStream.Test103ObjectStreamException;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
        /*
        Test035Exception in thread "main" java.io.InvalidClassException:

        Student;
        local class incompatible: stream classdesc serialVersionUID = 5145432029788848147
        local class serialVersionUID = 7285621389617401133

         */
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TestOfBili\\src\\TXTsort\\Test113.txt"));
        Student s = new Student("谭笑萌",19);
        oos.writeObject(s);
        oos.close();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TestOfBili\\src\\TXTsort\\Test113.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName()+", "+s.getAge());
        ois.close();
    }
}
