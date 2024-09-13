import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test044ListException {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("hello");
        l.add("world");
        l.add("java");

        Iterator<String> it = l.iterator();

        /*while (it.hasNext()) {
            String s = it.next();
            if (s.equals("world")) {
                l.add("javaee");
            }
        }*/
        //ConcurrentModificationException并发修改异常

        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i);
            if (s.equals("world")) {
                l.add("javaee");
            }
        }

        System.out.println(l);
    }
}
