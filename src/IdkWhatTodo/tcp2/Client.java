package IdkWhatTodo.tcp2;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @author : Rubi
 * @version : 2018-09-30 8:54
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //120.78.67.68
        Socket client = new Socket("localhost", 9999);
        ThreadFactory threadFactory = ConThreadFactory.getInstance();
        /*
        用户不需要线程池
        ExecutorService cachedThreadPool = new ThreadPoolExecutor(0,
                Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(), threadFactory);
        */
        threadFactory.newThread(new Receive(client)).start();
        threadFactory.newThread(new Send(client)).start();

    }
}
