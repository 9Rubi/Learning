package danli;

import java.util.concurrent.CountDownLatch;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 10:42
 */
public class TestSpeed {
    public static void main(String[] args) throws Exception{
        long start_time = System.currentTimeMillis();
        int thread_num = 100;
        final CountDownLatch cdl = new CountDownLatch(thread_num);
        for (int i = 0; i < thread_num; i++) {

            Runnable task= () -> {
                for (int j = 0; j < 1000000; j++) {
                    Object o = StaticInnerClassSingle.getInstance();
                }
                cdl.countDown();
            };
            new Thread(task).start();
        }

        cdl.await();
        long end_time = System.currentTimeMillis();
        System.out.println("总耗时："+(end_time-start_time));

    }


}
