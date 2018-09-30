package callback;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-25 14:46
 */
public class A implements CallBack {
    B b = new B();

    public void doA(){

        b.doSomething(this); // A运行时调用B中doSomething方法,以自身传入参数，B已取得A，可以随时回调A所实现的CallBack接口中的方法

    }
    @Override
    public void callbackMethod(){ // 对A来说，该方法就是回调方法

        System.out.println("A 回调了！!");

    }
}
