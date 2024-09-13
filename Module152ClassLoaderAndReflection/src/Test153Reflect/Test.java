package Test153Reflect;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c2 == c1);//true
        System.out.println("--------");

        //调用对象的getClass()方法，返回该对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3 == c1);
        System.out.println("--------");

        //使用Class类中的静态方法forName(String className)
        Class<?> c4 = Class.forName("Module152ClassLoaderAndReflection.Test153Reflect.Student");
        System.out.println(c4 == c1);
    }
}
