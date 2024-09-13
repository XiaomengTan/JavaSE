import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test160GetMethod2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*
            Student s = new Student();
            s.method1();
            s.method2("谭笑萌");
            String ss = s.method3("谭笑萌", 30);
            System.out.println(ss);
            s.function;
         */
        //获取Class对象
        Class<?> c = Class.forName("Module152ClassLoaderAndReflection.Test153Reflect.Student");

        //Student s = new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //s.method1();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        //s.method2("谭笑萌");
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj, "谭笑萌");

        //String ss = s.method3("谭笑萌", 30);
        //System.out.println(ss);
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "谭笑萌", 19);
        //可强转为String
        System.out.println(o);

        //s.function;
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);
    }
}
