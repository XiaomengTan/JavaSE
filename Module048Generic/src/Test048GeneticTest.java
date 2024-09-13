import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test048GeneticTest {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList();

        //添加集合元素
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);//ClassCastException

        //遍历集合
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);

//            String s = (String) it.next();

            String s = it.next();
            System.out.println(s);
        }
    }
}
