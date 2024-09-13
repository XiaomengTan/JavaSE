package Test116ThreadPriority;

public class ThreadPriorityClass extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0;i<100;i++){
            System.out.println(getName()+","+i);
        }
    }
}
