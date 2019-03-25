package j11.leetcode;

import java.util.Arrays;

/**
 * @author : Rubi
 * @version : 2019-03-23 14:28 下午
 */
public class 按奇偶排序数组 {
    /**
     * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
     * <p>
     * 你可以返回满足此条件的任何数组作为答案。
     * <p>
     * <p>
     * <p>
     * 示例：
     * <p>
     * 输入：[3,1,2,4]
     * 输出：[2,4,3,1]
     * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     * <p>
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= A.length <= 5000
     * 0 <= A[i] <= 5000
     *
     * @param args
     */
    public static void main(String[] args) {
        Arrays.stream(sortArrayByParity(new int[]{3, 1, 2, 4})).forEach(System.out::println);
    }

    public static int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        int count1=0,count2=0;
        for (int i : A) {
            if (i%2!=0){
               //奇
                B[length-count2-1] =i;
                count2++;
            }else {
                //偶
                B[count1] =i;
                count1++;
            }
        }


        return B;
    }
}
