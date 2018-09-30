package observer;

/**
 * @author : Rubi
 * @version : 2018-09-28 9:59
 */
public class Client  {
    public static void main(String[] args) {

        ConcreteSubject cs =new ConcreteSubject();

        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();

        cs.register(a);
        cs.register(b);
        cs.register(c);


        cs.setState(300);
        System.out.println(a.getMyState());
        System.out.println(b.getMyState());
        System.out.println(c.getMyState());



    }
}
