package Test120ThreadSecurityClass;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
            线程安全类
            StringBuffer
            Vector
            Hashtable
            内部方法均用synchronized修饰
         */
        StringBuffer sb1 = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> vector = new Vector<>();
        ArrayList<String> array = new ArrayList<>();

        Hashtable<String,String> ht = new Hashtable<>();
        HashMap<String,String> hm = new HashMap<>();

        /*
            StringBuffer还在使用
            但Vector和Hashtable已经有代替用法了，其方法内部的代码块均用synchronized修饰
         */
        //static <T> List<T> synchronizedList (List<T> list) 返回由指定列表支持的同步(线程安全)列表
        List<String> list = Collections.synchronizedList(new ArrayList<>());
    }
}
