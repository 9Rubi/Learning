package IdkWhatTodo.tcp2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author : Rubi
 * @version : 2018-09-30 9:18
 */
public class Send implements Runnable{
    private BufferedReader console;
    private DataOutputStream dos;
    private boolean isRunning=true;
    public Send(){
        console = new BufferedReader(new InputStreamReader(System.in));

    }

    public Send(Socket client) {
        this();
        try {
            dos = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            isRunning=false;
            CloseUtil.closeAll(console,dos);
            e.printStackTrace();
        }
    }
    private String getMsg(){
        try {
            return console.readLine();
        } catch (IOException e) {
            return "";
        }
    }

    public void sendMsg(){
        String msg = getMsg();
        if(msg!=null&&!msg.isEmpty()){
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                CloseUtil.closeAll(console,dos);
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while (isRunning){
            sendMsg();
        }
    }
}
