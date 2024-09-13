package Test066CollectionsStudent;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsStudent {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("linqinxia",30);
        Student s2 = new Student("zhangmanyu",35);
        Student s3 = new Student("wangzuxian",33);
        Student s4 = new Student("liuyan",33);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        Collections.sort(array,(Student sa,Student sb)-> sa.getAge()- sb.getAge()== 0?sa.getName().compareTo(sb.getName()):sa.getAge()- sb.getAge());

        for(Student s : array) {
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
}
