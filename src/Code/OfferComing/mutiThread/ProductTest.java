package Code.OfferComing.mutiThread;

import java.util.logging.Logger;

/**
 * 线程通信应用：经典例题：生产者/消费者问题
 * 线程通信的应用:经典例题:生产者/消费者问题
 * 生产者(Productor)将产品交给店员(Clerk),而消费者(Customer) 从店员处取走产品，
 * 店员-次只能持有固定数量的产品(比如:20)，如果生产者试图生产更多的产品，店员.
 * 会叫生产者停-下， 如果店中有空位放产品了再通知生产者继续生产:如果店中没有产品
 * 了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 * 分析:
 * 1.是否是多线程问题?是，生产者线程，消费者线程
 * 2.是否有共享数据?是，店员(或产品)
 * 3.如何解决线程的安全问题?同步机制，有三种方法
 * 4.是否涉及线程的通信?是
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");
        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");
        p1.start();
        c1.start();
    }
}
class Clerk{
    private int productNum =0;
    private Logger logger = Logger.getLogger(this.getClass().getName());

    //生产产品
    public synchronized void produceProduct() throws InterruptedException {
        if (productNum<20){
            logger.info((Thread.currentThread().getName())+"开始生产第"+productNum+"个产品");
            productNum++;
            notify();

        }else {
            wait();
        }
    }

    //消费产品
    public synchronized void consumeProduct() throws InterruptedException {
        if (productNum > 0) {
            logger.info((Thread.currentThread().getName())+"开始消费第"+productNum+"个产品");
            productNum--;
            notify();

        }else {
            wait();
        }
    }
}
class Producer extends Thread{ //生产者
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private Clerk clerk;

    @Override
    public void run() {
        logger.info(Thread.currentThread().getName()+"开始生产产品");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                clerk.produceProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
}
class Consumer extends Thread{ //消费者
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private Clerk clerk;

    @Override
    public void run() {
        logger.info(Thread.currentThread().getName()+"开始消费产品");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                clerk.consumeProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

}
