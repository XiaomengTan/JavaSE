import java.util.Set;

public class Test054ArgsDemo {
    public static void main(String[] args) {
//        //public static <T> asList(T... a):返回由指定数组支持的固定大小的列表
//        List<String> list = Arrays.asList("hello","world","java");
//
//        //列表大小已固定
////        list.add("javaee");//UnsupportedOperationException
////        list.remove("world");//UnsupportedOperationException
//
//        list.set(1,"java");
//
//        System.out.println(list);

//        //public static <E> List<E> of(E... elements):返回包含任意数量元素的不可变列表
//        List<String> list = List.of("hello","world","world","java");
//
////        list.add("javaee");//UnsupportedOperationException
////        list.remove("world");//UnsupportedOperationException
////        list.set(1,"javaee");//UnsupportedOperationException
//
//        System.out.println(list);


        //public static <E> Set<E> of(E... elements):返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("hello", "world", "java","world");//IllegalArgumentException
        Set<String> set = Set.of("hello", "world", "java");

//        set.add("javaee");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException


        System.out.println(set);


    }
}
