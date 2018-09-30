package factory.method;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:34
 */
public class Client {
    /**
     * 工厂方法类太多了
     * @param args
     */
    public static void main(String[] args) {
        Car a = new AudiFactory().createrCar();
        a.run();
    }
}
