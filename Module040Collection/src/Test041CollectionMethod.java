import java.util.ArrayList;
import java.util.Collection;

public class Test041CollectionMethod {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        System.out.println(c.add("hello"));
        System.out.println(c.add("world"));
        System.out.println(c.add("java"));
        //ArrayList的add方法返回值永远是true
        System.out.println(c);
        //Alt+7能够看到类的所有信息
        //Ctrl+B能够查看源码

        /*System.out.println(c.remove("world"));
        System.out.println(c);*/

        /*System.out.println(c.remove("worlds"));


        c.clear();*/

        //System.out.println(c.contains("world"));

        //System.out.println(c.isEmpty());

        System.out.println(c.size());

        System.out.println(c);
    }
}
