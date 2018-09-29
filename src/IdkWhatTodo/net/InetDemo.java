package IdkWhatTodo.net;

import java.net.InetAddress;

/**
 * ip dns
 * @author : Rubi
 * @version : 2018-09-29 20:53 下午
 */
public class InetDemo {
    public static void main(String[] args) throws Exception{
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
        System.out.println("======================");
        addr=InetAddress.getByName("www.rubi.ink");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());

        System.out.println("======================");

        addr=InetAddress.getByName("127.0.0.1");
        System.out.println(addr.getHostAddress());
        System.out.println(addr.getHostName());
    }
}
