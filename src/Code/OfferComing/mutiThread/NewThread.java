package Code.OfferComing.mutiThread;

public class NewThread extends Thread{
    /**
     * 实现多线程的三种方法之一：继承Thread类
     */
    public void run(){
        System.out.println("Create a thread by extends Thread");
    }

    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }
}
