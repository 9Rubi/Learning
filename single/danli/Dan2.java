package danli;

/**
 * @description: ${description}
 * @author: wangyijie
 * @create: 2018-09-26 09:41
 */
public class Dan2 {
    private static Dan2 dan2;
    private Dan2(){

    }
    public static synchronized Dan2 getInstance(){
        if(dan2==null){
            dan2= new Dan2();
        }
        return dan2;
    }
}
