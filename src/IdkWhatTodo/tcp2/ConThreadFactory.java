package IdkWhatTodo.tcp2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author : Rubi
 * @version : 2018-09-30 15:10
 */
public class ConThreadFactory implements ThreadFactory {

    private static ThreadFactory instance=new ConThreadFactory();
    private ConThreadFactory(){
    }
    public static  ThreadFactory getInstance() {
        return instance;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread=new Thread();
        return thread;
    }



}
