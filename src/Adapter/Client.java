package Adapter;

public class Client {
    public static void main(String[] args) {
        Client c = new Client();
        KeyBoard k = new KeyBoard();
        Usb u = new Adapter(k);
        c.test(u);
    }
    public  void  test(Usb u){
        u.handleRequest();
    }
}
