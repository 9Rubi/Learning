package state;

/**
 * @author : Administrator
 * @version : 2018-09-28 9:14
 */
public class CheckedState implements State{
    @Override
    public void handle() {
        System.out.println("CheckedState.handle");
    }
}
