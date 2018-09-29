package bridge;

/**
 * @author : Rubi
 * @version : 2018-09-26 22:06 下午
 */
public class Client {
    public static void main(String[] args) {
        Computer c = new Laptop(new Lenovo());
        c.sale();
    }
}
