package j11.detail;

/**
 * \
 *
 * @author : Rubi
 * @version : 2019-03-23 18:31 下午
 */
public class TestByte {

    public static void main(String[] args) {
        byte a =  127;
        short b = 32767;
        int c = 2147111111;
        long d = 9223369999993223131L;
        int a8=0b11111111;
        int ad=0x71;//赋值八进制数，前面加0


        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Long.toBinaryString(d));
        System.out.println(Long.toBinaryString(d).length());

    }
}
