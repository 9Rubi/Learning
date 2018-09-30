package factory.simple;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:13
 */
public class Benz implements Car {
    @Override
    public void run() {
        System.out.println("Benz is running");
    }
}
