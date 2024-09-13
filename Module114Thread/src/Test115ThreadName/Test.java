package Test115ThreadName;

public class Test {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
////        my1.run();
////        my2.run();
//        my1.setName("高铁");
//        my2.setName("飞机");

        //Thread(String name)
//        MyThread my1 = new MyThread("高铁");
//        MyThread my2 = new MyThread("飞机");
//
//        my1.start();
//        my2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
