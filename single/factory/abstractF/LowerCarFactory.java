package factory.abstractF;

/**
 * @author : wangyijie
 * @version : 2018-09-26 13:11
 */
public class LowerCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowerEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowerSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowerTyre();
    }
}
