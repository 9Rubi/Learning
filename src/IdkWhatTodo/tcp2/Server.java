package IdkWhatTodo.tcp2;

import com.sun.istack.internal.NotNull;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author : Rubi
 * @version : 2018-09-30 8:54
 */
public class Server {

    private List<MyChannel> channels = new ArrayList<>();
    private ThreadFactory threadFactory = ServerThreadFactory.getInstance();
    private ExecutorService cachedThreadPool = new ThreadPoolExecutor(0,
            Integer.MAX_VALUE,
            60L, TimeUnit.SECONDS,
            new SynchronousQueue<Runnable>(), threadFactory);
    public static void main(String[] args) throws IOException {
        new Server().start();

    }

    public void start() throws IOException {
        ServerSocket server = new ServerSocket(9999);
        while (true){
            Socket client = server.accept();
            MyChannel channel = new MyChannel(client);
            channels.add(channel);

            cachedThreadPool.execute(channel);
        }


    }

    private class MyChannel implements Runnable {
        private DataInputStream dis;
        private DataOutputStream dos;
        private boolean isRunning = true;
        private Socket client;

        public MyChannel() {

        }

        public MyChannel(Socket client) {
            this();
            try {
                dis = new DataInputStream(client.getInputStream());
                dos = new DataOutputStream(client.getOutputStream());
                this.client=client;
            } catch (IOException e) {
                isRunning = false;
                channels.remove(this);
                CloseUtil.closeAll(dis, dos);

            }
        }

        private String receive() {
            String msg = "";
            try {
                msg = dis.readUTF();
            } catch (IOException e) {
                isRunning = false;
                channels.remove(this);
                CloseUtil.closeAll(dis, dos);
            }
            return msg;
        }

        private void send(String msg) {
            if (msg != null && !msg.isEmpty()) {
                try {
                    dos.writeUTF(msg);
                    dos.flush();
                } catch (IOException e) {
                    isRunning = false;
                    channels.remove(this);
                    CloseUtil.closeAll(dis, dos);
                }
            }

        }
        private String getIp(){
           return client.getInetAddress().getHostAddress();
        }
        private void sendOthers(){
            String msg= this.receive();
            for (MyChannel other_channel : channels) {
                if(other_channel!=this){
                    other_channel.send(new Date ().toString()+"\n==="+getIp()+" : "+msg);
                }
                continue;

            }
        }

        @Override
        public void run() {
            while (isRunning) {
                sendOthers();
            }
        }
    }
}
