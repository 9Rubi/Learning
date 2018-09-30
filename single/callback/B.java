package callback;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-25 14:46
 */
public class B {
    public void doSomething(CallBack cb) { // B拥有一个参数为CallBack接口类型的方法

        System.out.println("bvbbbbbbb");

        System.out.println();

        cb.callbackMethod();
    }
}