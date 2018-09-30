package observer.Jdk;

/**
 * @author : Rubi
 * @version : 2018-09-28 10:16
 */
public class Adasd {
    public static void main(String[] args) {
        ConSubject cs = new ConSubject();
        ObserveA a = new ObserveA();
        ObserveA b = new ObserveA();
        ObserveA c = new ObserveA();
        cs.addObserver(a);
        cs.addObserver(b);
        cs.addObserver(c);

        cs.set(3000);
        System.out.println(a.getMystate());
        System.out.println(b.getMystate());
        System.out.println(c.getMystate());

    }
}
