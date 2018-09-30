package IdkWhatTodo.tcp2;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author : Rubi
 * @version : 2018-09-30 9:24
 */
public class CloseUtil {
    public static void closeAll(Closeable... io) {
        for (Closeable temp : io) {
            if(temp!=null){
                try {
                    temp.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
