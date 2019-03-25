package j11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2019-03-14 16:26 下午
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1023; i <= 5678; i++) {
            //排除 9
            if ((getNum(i,4) != 9 && getNum(i, 3) != 9) && (getNum(i, 2) != 9 && getNum(i, 1) != 9)) {
                //排出重复
                if (getNum(i,4) == getNum(i, 3) || getNum(i, 4) == getNum(i, 2)) {

                } else if (getNum(i, 4) == getNum(i, 1) || getNum(i, 3) == getNum(i, 2)) {

                } else if (getNum(i, 3) == getNum(i, 1) || getNum(i, 2) == getNum(i, 1)) {

                } else {
                    result.add(i);
                }
            }
        }
        result.forEach(System.out::println);
        System.out.println(result.size());
    }

    /**
     * @param origin ,
     * @param index .
     * @return .
     */
    private static int getNum(int origin, int index) {
        new Test();
        return (int) (origin % Math.pow(10, index) - origin % Math.pow(10, index - 1)) / (int) Math.pow(10, index - 1);
    }

}
