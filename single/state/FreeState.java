package state;

/**
 * @author : Administrator
 * @version : 2018-09-28 9:08
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("FreeState.handle");
    }
}
