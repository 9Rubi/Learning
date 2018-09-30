package factory.abstractF;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 11:44
 */
public interface Engine {
    void run();
    void start();
}


class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void start() {
        System.out.println("can auto control speed");
    }
}

class LowerEngine implements Engine {
    @Override
    public void run() {
        System.out.println("run slow");
    }

    @Override
    public void start() {
        System.out.println("cant auto control speed");
    }
}