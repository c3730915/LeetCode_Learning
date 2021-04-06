package Code.OfferComing.mutiThread;

public class ChildrenClassThread extends NewThread implements Runnable{
    /**
     * 第二种方法创建多线程：如果子类已经继承了一个基类，那么就不能
     * 再继承Thread类，因此此时可以实现接口
     */
    public void run(){
        System.out.println("Create a thread by implements Runnable");
    }

    public static void main(String[] args) {
        //实例化一个ChildrenClassThread类
        ChildrenClassThread classThread = new ChildrenClassThread();
        //创建一个线程对象，并且传入已经实例化好的childrenThread类
        Thread thread = new Thread(classThread);
        //调用start方法启动
        thread.start();

    }
}
