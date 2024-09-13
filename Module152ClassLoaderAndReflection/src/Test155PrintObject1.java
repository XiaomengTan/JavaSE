import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test155PrintObject1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Module152ClassLoaderAndReflection.Test153Reflect.Student");

        //public Student(String name, int age, String address)
        //Constructor<T> getConstructor(ThisIsClass<?>... parameterTypes)
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //基本数据类型也可以通过.class获取对应的Class类的对象

        //T newInstance(Object... initargs)
        Object obj = con.newInstance("谭笑萌", 19, "广州");
        System.out.println(obj);
    }
}
