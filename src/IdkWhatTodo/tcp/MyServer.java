package IdkWhatTodo.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Rubi
 * @version : 2018-09-29 23:46 下午
 */
public class MyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        for (;;){
            Socket socket= server.accept();
            System.out.println("one client connected");
        }

    }
}
