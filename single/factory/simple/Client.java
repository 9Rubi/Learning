package factory.simple;

import org.junit.Test;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:15
 */
public class Client {
    public static void main(String[] args) {
        Car a = new Audi();
        Car b = new Benz();
        a.run();
        b.run();
    }

    /**
     * 简单工厂对扩展 必须更改已有代码，也叫静态工厂
     */
    @Test
    public void 测试简单工厂(){
        CarSimpleFactory csf =CarSimpleFactory.getInstance();
        Car a=csf.createrCar("benz");
        a.run();
    }
}
