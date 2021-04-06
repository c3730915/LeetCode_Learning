package Code.OfferComing.mutiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable implements Callable<String> {
    /**
     * 如果需要开启多个子线程，并发执行一个任务，然后收集各个线程的执行返回结果
     * 并最终汇总起来，这个时候就用到了Callable接口
     */
    private String name;
    private MyCallable(String name){
        //通过构造函数为线程传递参数，以定义线程的名称
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        return name;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个大小固定为5的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        //创建多个有返回值的任务列表list
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < 5; i++) {
            MyCallable callable = new MyCallable(i + " ");
            //提交线程，获取Future对象并且保存到list中
            Future future = pool.submit(callable);
            System.out.println("submit a callable thread "+i);
            list.add(future);
        }
        //关闭线程池
        pool.shutdown();
        for (Future future : list) {
            System.out.println("get the result from callable thread:"+future.get().toString());
        }

    }
}
