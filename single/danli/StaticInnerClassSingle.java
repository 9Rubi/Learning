package danli;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 09:54
 */
public class StaticInnerClassSingle {
    private StaticInnerClassSingle(){}
    private static class StaticInnerClassSingleInstance{
        private static final StaticInnerClassSingle instance = new StaticInnerClassSingle();
    }
    public static StaticInnerClassSingle getInstance(){
        return StaticInnerClassSingleInstance.instance;
    }
}
