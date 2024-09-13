import java.util.ArrayList;

public class Test030ArrayList1 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();
        System.out.println(array);

        //调用无参方法add添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println(array);

        //调用带参方法add添加元素
        array.add(1,"bytxm");
        array.add(4,"hhhh");
        System.out.println(array);
    }
}
