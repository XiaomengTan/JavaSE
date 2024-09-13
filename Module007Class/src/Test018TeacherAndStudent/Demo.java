package Test018TeacherAndStudent;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("谭笑萌");
        t1.setAge(19);
        System.out.println(t1.getName() + ", " + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("谭笑萌", 19);
        System.out.println(t2.getName() + ", " + t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setName("谭笑萌");
        s1.setAge(19);
        System.out.println(s1.getName()+", "+s1.getAge());
        s1.study();

        Student s2 = new Student("谭笑萌", 19);
        System.out.println(s2.getName() + ", " + s2.getAge());
        s2.study();
    }
}
