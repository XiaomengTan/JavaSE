import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test042Iterator {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator<String> it = c.iterator();
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        */

        //集合的遍历
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

    }
}
