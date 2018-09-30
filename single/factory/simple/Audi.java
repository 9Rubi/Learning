package factory.simple;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:13
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("Audi is running");
    }
}
