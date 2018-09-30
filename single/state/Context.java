package state;

/**
 * @author : Administrator
 * @version : 2018-09-28 9:14
 */
public class Context{
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state.handle();
        this.state = state;
        this.state.handle();
    }

}
