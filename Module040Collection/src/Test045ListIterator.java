import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test045ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");
        /*
        ListIterator<String> lit = list.listIterator();



        //next()很少用，正向遍历一般直接使用iterator
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //hasPrevious()逆向遍历，了解即可
        while(lit.hasPrevious()){
            String s = lit.previous();
            System.out.println(s);
        }
        */

        //add()
        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")) {
                lit.add("javaee");
            }
        }
        System.out.println(list);
        System.out.println("--------");

        //增强for循环，简化数组和Collection集合的遍历
        for (String s : list) {
            System.out.println(s);
        }

        //增强for循环内部是一个迭代器
        /*
        for(String s:list){
            if(s.equals("world")){
                list.add("javase");
            }
        }
        */
        //ConcurrentModificationException
    }
}
