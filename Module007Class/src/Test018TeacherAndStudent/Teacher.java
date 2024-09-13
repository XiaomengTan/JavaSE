package Test018TeacherAndStudent;

public class Teacher extends Person{
    public Teacher(){ }

    public Teacher(String name,int age){
        super(name,age);
    }

    public void teach(){
        System.out.println("教学生");
    }
}
