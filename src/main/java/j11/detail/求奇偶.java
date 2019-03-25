package j11.detail;

/**
 * @author : Rubi
 * @version : 2019-03-24 13:47 下午
 */
public class 求奇偶 {

    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(0b10000000000000000000000000000000);
        System.out.println(Integer.toBinaryString(~0b00000000));
        System.out.println(~1);
    }


    public static boolean isOdd(int number) {
        return (number & 1) == 0;
    }

    public static boolean isEven() {
        return false;
    }

}
