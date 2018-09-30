package factory.abstractF;

/**
 * @author : wangyijie
 * @version : 2018-09-26 13:13
 */
public class Client {
    public static void main(String[] args) {
       CarFactory factory = new LuxuryCarFactory();
       Engine a= factory.createEngine();
       Seat b= factory.createSeat();
       Tyre c= factory.createTyre();
       a.run();
       a.start();
       b.massage();
       c.revolve();
    }
}
