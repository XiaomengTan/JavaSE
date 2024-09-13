package Test116ThreadPriority;

public class Test {
    public static void main(String[] args) {
        ThreadPriorityClass tp1 = new ThreadPriorityClass();
        ThreadPriorityClass tp2 = new ThreadPriorityClass();
        ThreadPriorityClass tp3 = new ThreadPriorityClass();

        tp1.setName("1");
        tp2.setName("22");
        tp3.setName("333");

        //public final int getPriority()返回此线程的优先级
//        System.out.println(tp1.getPriority());//5
//        System.out.println(tp2.getPriority());//5
//        System.out.println(tp3.getPriority());//5

        //public final int setPriority():更改线程优先级
//        tp1.setPriority(10000);//IllegalArgumentException
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);

        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);


        tp1.start();
        tp2.start();
        tp3.start();
    }
}
