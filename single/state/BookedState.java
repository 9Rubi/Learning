package state;

/**
 * @author : Administrator
 * @version : 2018-09-28 9:09
 */
public class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("BookedState.handle");
    }
}
