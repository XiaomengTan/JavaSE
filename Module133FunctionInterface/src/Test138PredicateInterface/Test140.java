package Test138PredicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test140 {
    public static void main(String[] args) {
        //创建原来的字符串数组，添加内容
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};

        //调用判断方法
        ArrayList<String> array = filter(strArray, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 33);

        //最后遍历集合输出符合要求的内容
        for(String s : array){
            System.out.println(s);
        }
    }

    //通过Predicate接口拼装，将符合要求的字符串筛选到集合中，并遍历集合
    private static ArrayList<String> filter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<>();

        //遍历字符串数组
        for (String s : strArray){

            //用if判断语句判断当前字符串是否符合条件
            if(pre1.and(pre2).test(s)){
                array.add(s);
            }
        }

        return array;
    }
}
