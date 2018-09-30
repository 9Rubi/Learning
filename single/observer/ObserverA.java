package observer;

/**
 * @author : Rubi
 * @version : 2018-09-28 9:57
 */
public class ObserverA implements Observer{
    private int myState; //
    @Override
    public void update(Subject subject) {
        myState= ((ConcreteSubject) subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
