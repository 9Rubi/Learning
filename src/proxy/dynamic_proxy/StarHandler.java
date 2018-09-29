package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * dynamic create
 *
 * @author : Rubi
 * @version : 2018-09-26 21:19 下午
 */
public class StarHandler implements InvocationHandler {
    private Star real_star;

    public StarHandler(Star real_star) {
        this.real_star = real_star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equalsIgnoreCase("sing")){
            method.invoke(real_star,args);
        }else {
           // method.invoke()
        }
        return null;
    }
}
