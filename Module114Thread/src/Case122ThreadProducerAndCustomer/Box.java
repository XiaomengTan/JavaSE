package Case122ThreadProducerAndCustomer;

public class Box {
    //定义一个成员变量，表示第x瓶奶
    private int milk;
    //定义成员变量表示奶箱状态
    private boolean state = false;

    //提供存储牛奶和获取牛奶的操作

    public synchronized void get() {
        //如果没有牛奶，就等待生产
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果有牛奶就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");

        //消费牛奶之后，修改奶箱状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }

    public synchronized void put(int milk) {
        //如果有牛奶，应该等待消费
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

        //生产牛奶之后修改奶箱状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();
    }
}
