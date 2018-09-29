package bridge;

/**
 * @author : Rubi
 * @version : 2018-09-26 21:40 下午
 */
public class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void sale(){
        brand.sale();
    }
}
class DeskTop extends Computer{
    public DeskTop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("DeskTop.sale");
    }
}
class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("Laptop.sale");
    }
}