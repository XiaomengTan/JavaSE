package Test060StringStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);

        Set<String> keySet = hm.keySet();

        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + ", " + value.getName() + ", " + value.getAge());
        }

        System.out.println("--------");

        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + ", " + value.getName() + ", " + value.getAge());
        }
    }
}
