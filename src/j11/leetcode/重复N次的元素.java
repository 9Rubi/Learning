package j11.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Rubi
 * @version : 2019-03-23 14:58 下午
 */
public class 重复N次的元素 {
    /**
     * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
     * <p>
     * 返回重复了 N 次的那个元素。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：[1,2,3,3]
     * 输出：3
     * <p>
     * 示例 2：
     * <p>
     * 输入：[2,1,2,5,3,2]
     * 输出：2
     * <p>
     * 示例 3：
     * <p>
     * 输入：[5,1,5,2,5,3,5,4]
     * 输出：5
     * <p>
     * <p>
     * <p>
     * 提示：
     * <p>
     * 4 <= A.length <= 10000
     * 0 <= A[i] < 10000
     * A.length 为偶数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 5}));
    }

    public static int repeatedNTimes(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }
}
