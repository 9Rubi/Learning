package IdkWhatTodo.tcp2;

import java.util.concurrent.ThreadFactory;

/**
 * @author : Rubi
 * @version : 2018-09-30 15:20
 */
public class ServerThreadFactory implements ThreadFactory {
    private static ServerThreadFactory instance = new ServerThreadFactory();

    public static ServerThreadFactory getInstance() {
        return instance;
    }

    private ServerThreadFactory() {
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread =new Thread(r);
        return thread;
    }
}
