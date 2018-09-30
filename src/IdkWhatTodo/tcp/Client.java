package IdkWhatTodo.tcp;

import java.io.*;
import java.net.Socket;

/**
 * @author : Rubi
 * @version : 2018-09-30 8:54
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 9999);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        while (true) {
            String info = console.readLine();

            dos.writeUTF(info);
            dos.flush();


            String msg = dis.readUTF();

            System.out.println(msg);
        }
    }
}
