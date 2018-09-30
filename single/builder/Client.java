package builder;

/**
 * @author : wangyijie
 * @version : 2018-09-26 13:55
 */
public class Client {
    public static void main(String[] args) {
        AirShipBuilder builder = NoobAirShipBuilder.getInstance();

        AirShipDirector director = NoobAirShipDirector.getInstance(builder);
        Airship airship=director.directAirShip();
        System.out.println(airship);
    }
}
