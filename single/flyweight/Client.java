package flyweight;

/**
 * client
 *
 * @author : Administrator
 * @version : 2018-09-27 10:14
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight c1=ChessFlyWeightFactory.getChess("dark");
        ChessFlyWeight c2=ChessFlyWeightFactory.getChess("dark");
        ChessFlyWeight c3=ChessFlyWeightFactory.getChess("white");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("====================================");
        c1.display(new Coordinate(1,2));
        c2.display(new Coordinate(1,2));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("====================================");
        c1.display(new Coordinate(4,5));
        c2.display(new Coordinate(15,2));
        System.out.println(c1);
        System.out.println(c2);

        //颜色可以共享
        //位置不可以共享
    }
}
