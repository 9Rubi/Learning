package bridge;

/**
 * @author : Rubi
 * @version : 2018-09-26 22:03 下午
 */
public interface Brand {
    void sale();
}
class Lenovo implements  Brand{

    @Override
    public void sale() {
        System.out.println("Lenovo.sale");
    }
}
class Dell implements  Brand{

    @Override
    public void sale() {
        System.out.println("Dell.sale");
    }
}
