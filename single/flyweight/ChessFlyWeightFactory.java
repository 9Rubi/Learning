package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Administrator
 * @version : 2018-09-27 10:06
 */
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map = new HashMap<>();
    public  static ChessFlyWeight getChess(String color){
        if (map.get(color) != null) {
            return map.get(color);
        }else {
            ChessFlyWeight cfw =new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}
