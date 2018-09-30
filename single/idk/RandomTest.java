package idk;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-19 16:26
 */
public class RandomTest {
    public static <T extends Father> void start(T t) {
        t.fuk();
    }
    public static void main(String[] args) throws InterruptedException {
        Child_1 c=new Child_1();
        start(c);
    }
}
