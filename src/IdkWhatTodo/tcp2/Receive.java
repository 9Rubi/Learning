package IdkWhatTodo.tcp2;

import java.io.*;
import java.net.Socket;

/**
 * @author : Rubi
 * @version : 2018-09-30 9:18
 */
public class Receive implements Runnable{
    private DataInputStream dis;
    private boolean isRunning=true;

    public Receive(){
    }

    public Receive(Socket client) {
        this();
        try {
           dis=new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            isRunning=false;
            CloseUtil.closeAll(dis);
            e.printStackTrace();
        }
    }

    public String receive(){
        String msg = "";
        try {
           msg = dis.readUTF();
        } catch (IOException e) {
            isRunning=false;
            CloseUtil.closeAll(dis);
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public void run() {
        while (isRunning){
            System.out.println(receive());
        }
    }
}
