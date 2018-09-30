package factory.method;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:32
 */
public class AudiFactory implements CarFactory{
    @Override
    public Car createrCar() {
        return new Audi();
    }
}
