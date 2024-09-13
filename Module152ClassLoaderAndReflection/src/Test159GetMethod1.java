import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test159GetMethod1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("Module152ClassLoaderAndReflection.Test153Reflect.Student");

        //Method[] getMethods() 返回一个包含 方法对象的数组， 方法对象反映由该 Class对象表示的类或接口的所有公共方法，包括由类或接口声明的对象以及从超类和超级接口继承的类。
        //Method[] getDeclaredMethods() 返回一个包含 方法对象的数组， 方法对象反映由 Class对象表示的类或接口的所有声明方法，包括public，protected，default（package）访问和私有方法，但不包括继承方法。
//        Method[] methods = c.getMethods();//包括继承的方法，但不是所有的方法
        Method[] methods = c.getDeclaredMethods();//不包括继承的，但是本类所有的方法
        for (Method method : methods) {
            System.out.println(method);
        }

        //Method getMethod(String name, ThisIsClass<?>... parameterTypes) 返回一个 方法对象，该对象反映由该 Class对象表示的类或接口的指定公共成员方法。
        //Method getDeclaredMethod(String name, ThisIsClass<?>... parameterTypes) 返回一个 方法对象，它反映此表示的类或接口的指定声明的方法 Class对象。
        Method m = c.getMethod("method1");
        System.out.println(m);

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
//        obj.m;
        //在类或接口上提供有关单一方法的信息和访问权限
        //Object invoke(Object obj, Object... args) 在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
        //Object:返回值类型
        //obj:调用方法的对象
        //args:方法需要的参数
        m.invoke(obj);




/*
        //通过无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        //给成员变量赋值
//        Field nameField = c.getField("name");//私有方法要Declared
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);//暴力使用，取消访问检查
        nameField.set(obj, "谭笑萌");
        System.out.println(obj);

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 19);
        System.out.println(obj);

        //可以不用Declared
        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj, "广州");
        System.out.println(obj);






        //Constructor<?>[] getConstructors() 返回一个包含 Constructor对象的数组， Constructor对象反映了由该 Class对象表示的类的所有公共构造函数。
//        Constructor<?>[] cons = c.getConstructors();
        //Constructor<?>[] getDeclaredConstructors() 返回反映由该 Class对象表示的类声明的所有构造函数的 Constructor对象的数组。
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }

        System.out.println("--------");

        //Constructor<T> getConstructor(ThisIsClass<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数。
        //Constructor<T> getDeclaredConstructor(ThisIsClass<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数。

        Constructor<?> con = c.getConstructor();
        //T newInstance(Object... initargs) 使用由此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object obj = con.newInstance();
        System.out.println(obj);

        //上面就是反射（（（

 */
    }
}
