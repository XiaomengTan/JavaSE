package Case159_5ByMe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ThisIsTest {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<ThisIsClass> c = ThisIsClass.class;

        Constructor<ThisIsClass> con = c.getDeclaredConstructor();
        con.setAccessible(true);
        ThisIsClass tic = con.newInstance();

        Field field = c.getDeclaredField("field");
        field.setAccessible(true);
        field.set(tic, "这是实例字段");
        System.out.println(tic);

        Method method = c.getDeclaredMethod("method");
        method.setAccessible(true);
        method.invoke(tic);
    }
}
