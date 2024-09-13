package Test162PropertiesSetCode;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Student s = new Student();
//        s.study();

//        Teacher t = new Teacher();
//        t.teach();

        /*
            class.txt
            className=xxx
            methodName=xxx
         */
        //配置文件
        Properties prop = new Properties();
        FileReader fr = new FileReader("TestOfBili\\src\\TXTsort\\Test166.txt");
        prop.load(fr);
        fr.close();

        /*
            //获取Class对象
            Class<?> c = Class.forName("Module152ClassLoaderAndReflection.Test153Reflect.Student");

            Method m = c.getMethod("method1");
            m.invake(obj);
         */
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m = c.getMethod(methodName);
        m.invoke(obj);

    }
}
