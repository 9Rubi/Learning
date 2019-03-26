package j11.leetcode;

import java.util.Arrays;

/**
 * @author : Rubi
 * @version : 2019-03-26 20:52 下午
 */
public class 按奇偶排序数组II {
    /**
     * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
     * <p>
     * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
     * <p>
     * 你可以返回任何满足上述条件的数组作为答案。
     * <p>
     * <p>
     * <p>
     * 示例：
     * <p>
     * 输入：[4,2,5,7]
     * 输出：[4,5,2,7]
     * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
     * <p>
     * <p>
     * <p>
     * 提示：
     * <p>
     * 2 <= A.length <= 20000
     * <p>
     * A.length % 2 == 0
     * <p>
     * 0 <= A[i] <= 1000
     *
     * @param args
     */
    public static void main(String[] args) {
        Arrays.stream(sortArrayByParityII(new int[]{4, 2, 5, 7})).forEach(System.out::println);
    }

    public static int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length - 1; i = i + 2) {
            if ((A[i] & 1) != 0) {//奇数
                while ((A[j] & 1) != 0) {//如果是奇数
                    j = j + 2;
                }
                A[i] = A[j] + A[i];
                A[j] = A[i] - A[j];
                A[i] = A[i] - A[j];
            }
        }
        return A;
    }
}
