package Adapter;

public class Adapter  implements Usb {
    private  KeyBoard keyBoard;
    @Override
    public void handleRequest() {
        keyBoard.request();
    }

    public Adapter(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }
}
