package Test104PropertiesAndIO;

import java.util.Properties;
import java.util.Set;

public class Test106PropertiesSpecial {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //Object setProperty(String key,String value):设置集合元素的键和值
        prop.setProperty("202144011123", "谭笑萌");
        /*
            public synchronized Object setProperty(String key, String value) {
                return put(key, value);
            }

            public synchronized Object put(Object key, Object value) {
                return map.put(key, value);
            }
         */
        prop.setProperty("202144011124", "肖运森");
        prop.setProperty("202144011125", "林正庭");

        //String getProperty(String key):传入键返回值
//        System.out.println(prop.getProperty("202144011123"));
//
//        System.out.println(prop.getProperty("2021440111233"));//不存在就返回null

//        System.out.println(prop);

        //Set<String> stringPropertyNames():从该属性列表中返回一个不可修改的键集，其中键对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
//            System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }
    }
}
