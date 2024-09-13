import java.util.ArrayList;
import java.util.List;

public class Test043ListBasics {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("hello");
        l.add("world");
        l.add("java");
/*
        l.add(1,"javaee");
        l.add(11,"javame");//IndexOutOfBoundsException
  */

       // l.remove(1);

        //System.out.println(l.set(1,"javatxm"));

        //get
        System.out.println(l.get(2));

        //索引不要越界
        System.out.println(l);
    }
}
