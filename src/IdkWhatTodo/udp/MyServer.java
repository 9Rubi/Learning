package IdkWhatTodo.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 1.创建 服务端和端口
 * 2.准备 接受容器
 * 3.封装成包
 * 4.接收数据
 * 5.分析数据
 * @author : Rubi
 * @version : 2018-09-29 22:57 下午
 */
public class MyServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(8888);
        for(;;){
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,container.length);
            server.receive(packet); //阻塞
            System.out.println(new String(packet.getData(),0,packet.getLength()));
        }

    }
}
