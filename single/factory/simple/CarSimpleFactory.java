package factory.simple;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:17
 */
public class CarSimpleFactory {
    private static class CarFactoryCreator{
       private final static CarSimpleFactory instance=new CarSimpleFactory();
    }
    private CarSimpleFactory(){

    }
    public static CarSimpleFactory getInstance(){
        return CarFactoryCreator.instance;
    }

    public Car createrCar(String type){
        if(type.equalsIgnoreCase("audi")){
            return new Audi();
        }else if (type.equalsIgnoreCase("benz")){
            return new Benz();
        }else {
            return null;
        }

    }
}
