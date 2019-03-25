package proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * client
 *
 * @author : Rubi
 * @version : 2018-09-26 21:23 下午
 */
public class Client {
    public static void main(String[] args) {
        Star real_star = new RealStar();
        StarHandler sh = new StarHandler(real_star);
        Star star_proxy= (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},sh);
        star_proxy.bookTicket();
        star_proxy.collectMoney();
        star_proxy.confer();
        star_proxy.signContract();
        star_proxy.sing();
    }
}
