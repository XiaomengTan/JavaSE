import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test161SkipCheck {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> array = new ArrayList<>();

        /*
            array.add(10);
            array.add(20);
            array.add("10");
         */

        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");

        System.out.println(array);
    }
}
