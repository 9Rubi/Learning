package state;

/**
 * @author : Administrator
 * @version : 2018-09-28 9:17
 */
public class Client {
    public static void main(String[] args) {
        //State s = new BookedState();
//        Context<BookedState> c = new Context<>(new BookedState());
//        c.setT(new CheckedState());
        Context c = new Context(new BookedState());
        c.setState(new CheckedState());
    }
}
