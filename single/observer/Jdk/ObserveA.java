package observer.Jdk;

import java.util.Observer;

/**
 * @author : Rubi
 * @version : 2018-09-28 10:12
 */
public class ObserveA implements Observer {
    private int mystate;
    @Override
    public void update(java.util.Observable o, Object arg) {
        mystate= ((ConSubject) o).getState();
    }

    public int getMystate() {
        return mystate;
    }

    public void setMystate(int mystate) {
        this.mystate = mystate;
    }
}
