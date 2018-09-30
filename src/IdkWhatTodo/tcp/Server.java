package IdkWhatTodo.tcp;

import IdkWhatTodo.tcp2.CloseUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2018-09-30 8:54
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        Socket client= server.accept();

        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        while (true) {
            String info=dis.readUTF();
            System.out.println("server_receive:"+info);
            dos.writeUTF("server----->"+info);
            dos.flush();
        }




    }

}


