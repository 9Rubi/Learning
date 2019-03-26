package j11.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Rubi
 * @version : 2019-03-26 21:19 下午
 */
public class 自除数 {
    /**
     * 自除数 是指可以被它包含的每一位数除尽的数。
     * <p>
     * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
     * <p>
     * 还有，自除数不允许包含 0 。
     * <p>
     * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
     * <p>
     * 示例 1：
     * <p>
     * 输入：
     * 上边界left = 1, 下边界right = 22
     * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
     * <p>
     * 注意：
     * <p>
     * 每个输入参数的边界满足 1 <= left <= right <= 10000。
     *
     * @param args
     */
    public static void main(String[] args) {
        selfDividingNumbers(1, 22).forEach(System.out::println);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (; left <= right; left++) {
            if (isSelfDivide(left))
                res.add(left);
        }
        return res;
    }

    public static boolean isSelfDivide(int val) {
        int rawNum = val;
        while (val != 0) {
            int digit = (val % 10);
            if (digit == 0) return false;
            if (rawNum % digit != 0) return false;
            val /= 10;
        }
        return true;
    }
}
