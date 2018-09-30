package observer.Jdk;

import java.util.Observable;

/**
 * @author : Rubi
 * @version : 2018-09-28 10:09
 */
public class ConSubject extends Observable {
    private int state;
    public void set(int s){
        state =s;
        setChanged();
        notifyObservers(state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
