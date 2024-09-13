import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test156PrintObject2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Module152ClassLoaderAndReflection.Test153Reflect.Student");

        //private Student(String name)
        //Constructor<T> getDeclaredConstructor(ThisIsClass<?>... parameterTypes)
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //暴力反射
        //正常来说不能通过私有构造方法创建对象，而反射却可以
        //void setAccessible(boolean flag)将此反射对象的 accessible标志设置为指示的布尔值，即取消访问检查
        con.setAccessible(true);
        Object obj = con.newInstance("谭笑萌");
        System.out.println(obj);//IllegalAccessException
    }

}
