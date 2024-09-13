import java.util.ArrayList;

public class Test031ArrayList2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();

        //调用无参方法add添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //不存在则返回false
        System.out.println(array.remove("world"));

        //不能越界，否则报错
        array.remove(1);

        System.out.println(array);


        array.add("world");
        array.add("java");

        //set索引不能越界
        array.set(2,"jaaaaa");
        System.out.println(array);

        System.out.println(array.size());
    }
}
