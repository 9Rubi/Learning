package factory.abstractF;

/**
 *
 * @author : wangyijie
 * @version : 2018-09-26 13:07
 */
public interface CarFactory {
   Engine createEngine();
   Seat createSeat();
   Tyre createTyre();
}
