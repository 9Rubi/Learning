package j11.leetcode;

import java.util.stream.IntStream;

/**
 * @author : Rubi
 * @version : 2019-03-21 16:16 下午
 */
public class 有序数组的平方 {

    /**
     * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：[-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * <p>
     * 示例 2：
     * <p>
     * 输入：[-7,-3,2,3,11]
     * 输出：[4,9,9,49,121]
     * <p>
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= A.length <= 10000
     * -10000 <= A[i] <= 10000
     * A 已按非递减顺序排序。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] results = sortedSquares(new int[]{-4, -1, 0, 3, 10});
//        assert results != null;
        for (int result : results) {
            System.out.println(result);
        }
    }


    public static int[] sortedSquares(int[] A) {
        return IntStream.of(A).map(i -> i *= i).sorted().toArray();
    }


}
