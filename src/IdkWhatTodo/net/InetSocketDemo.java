package IdkWhatTodo.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * port + InetAddress
 * 在InetAddress 基础上加端口
 * @author : Rubi
 * @version : 2018-09-29 21:46 下午
 */
public class InetSocketDemo {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost",80);
        System.out.println(address.getHostName());

        System.out.println(address.getPort());
        InetAddress addr = address.getAddress();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
    }
}
