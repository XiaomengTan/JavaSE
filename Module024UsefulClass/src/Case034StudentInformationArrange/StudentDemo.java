package Case034StudentInformationArrange;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        //定义集合储存学生类
        ArrayList<Student> array = new ArrayList<>();

        //循环实现界面复现
        while (true) {
            //主界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            //录入选择
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //选择结构
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        for (; true; ) {
            //创建对象
            Scanner sc = new Scanner(System.in);
            Student s = new Student();

            //输入数据
            System.out.println("请输入学号：");
            String sid = sc.nextLine();

            //判断学号
            if (!isUsed(array, sid)) {
                s.setSid(sid);
                System.out.println("请输入姓名：");
                s.setName(sc.nextLine());
                System.out.println("请输入年龄：");
                s.setAge(sc.nextLine());
                System.out.println("请输入居住地：");
                s.setAdress(sc.nextLine());

                //添加到集合
                array.add(s);

                //输出提示信息
                System.out.println("添加成功");
                break;
            } else {
                System.out.println("学号已存在，重新输入（1）回到主界面");
                int change = sc.nextInt();
                if (change != 1) break;
            }
        }
    }

    public static void findAllStudent(ArrayList<Student> array) {
        //判断是否有信息
        if (array.size() == 0) {
            System.out.println("无信息，请先添加学生信息");
            return;
        }

        //输出表头
        System.out.println("学号\t\t\t姓名\t年龄\t居住地");

        //输出内容并格式化界面
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAdress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        for (; true; ) {
            //创建输入的sc对象
            Scanner sc = new Scanner(System.in);

            //提示信息
            System.out.println("请输入你要删除的学生的学号");
            String sid = sc.nextLine();

            //定义索引变量
            int index = -1;
            //遍历集合，判断是否存在
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getSid().equals(sid)) {
                    index = i;
                    break;
                }
            }

            //根据index判断是否存在该学号
            if (index == -1) {
                System.out.println("你输入的学号不存在，继续输入（1）返回主界面（0）");
                int change = sc.nextInt();
                if (change != 1) break;
            } else {
                array.remove(index);
                //删除成功的提示信息
                System.out.println("删除成功");
                break;
            }
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        for (; true; ) {
            //输入要修改的学号，显示提示信息
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要修改的学生学号");
            String targetsid = sc.nextLine();

            //定义索引变量
            int index = -1;
            //遍历集合，判断是否存在
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getSid().equals(targetsid)) {
                    index = i;
                    break;
                }
            }

            //根据index判断是否存在该学号
            if (index == -1) {
                System.out.println("你输入的学号不存在，继续输入（1）返回主界面（0）");
                int change = sc.nextInt();
                if (change != 1) break;
            } else {
                //录入新信息
                System.out.println("请输入新学号");
                String sid = sc.nextLine();

                System.out.println("请输入新姓名");
                String name = sc.nextLine();

                System.out.println("请输入新年龄");
                String age = sc.nextLine();

                System.out.println("请输入新地址");
                String adress = sc.nextLine();

                //创建新对象进行封装
                Student s = new Student();
                s.setSid(sid);
                s.setName(name);
                s.setAge(age);
                s.setAdress(adress);

                //用set方法替换对象
                array.set(index, s);

                //提示信息，修改成功
                System.out.println("修改成功");
                break;
            }
        }
    }

    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
