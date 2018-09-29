package IdkWhatTodo.tcp;

import java.io.IOException;
import java.net.Socket;

/**
 * @author : Rubi
 * @version : 2018-09-29 23:49 下午
 */
public class MyClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        for(;;){
            Socket client= new Socket("localhost",8888);
            Thread.sleep(100);
        }
    }
}
