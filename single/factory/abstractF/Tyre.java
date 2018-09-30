package factory.abstractF;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 13:01
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("wearing-free");
    }
}

class  LowerTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("wearing-easily");
    }
}
