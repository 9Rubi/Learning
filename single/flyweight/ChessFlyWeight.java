package flyweight;

/**
 * xiangyuanlei
 * @author : Administrator
 * @version : 2018-09-27 9:43
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}

class ConcreteChess implements ChessFlyWeight {
    private String color;
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println(color);
        System.out.println(coordinate.getX()+"|"+coordinate.getY());

    }

    public ConcreteChess(String color) {
        this.color = color;
    }
}
