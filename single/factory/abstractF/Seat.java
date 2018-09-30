package factory.abstractF;

/**
 *
 * @author : wangyijie
 * @version : 2018-09-26 12:54
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {
    @Override
    public void massage() {
        System.out.println("can massage");
    }
}

class LowerSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("cant massage");
    }
}
