package factory.method;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:33
 */
public class BenzFactory implements CarFactory{
    @Override
    public Car createrCar() {
        return new Benz();
    }
}
