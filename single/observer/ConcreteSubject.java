package observer;

/**
 * 服务器
 * @author : Rubi
 * @version : 2018-09-28 9:55
 */
public class ConcreteSubject extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {

        this.state = state;
        this.notifyAllObserver();
    }
}
