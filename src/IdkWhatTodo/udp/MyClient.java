package IdkWhatTodo.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author : Rubi
 * @version : 2018-09-29 23:04 下午
 */
public class MyClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket(6666);
        String msg = "fuckyou 的";
        byte[] data = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, new InetSocketAddress("localhost",8888));
        client.send(packet);
        client.send(packet);
        client.send(packet);
        client.send(packet);
        client.send(packet);
        client.send(packet);
        client.send(packet);
        client.send(packet);
        client.close();
       // DatagramPacket packet = new DatagramPacket(container,container.length);
    }
}
