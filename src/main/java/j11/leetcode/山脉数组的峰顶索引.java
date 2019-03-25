package j11.leetcode;

/**
 * @author : Rubi
 * @version : 2019-03-25 15:57 下午
 */
public class 山脉数组的峰顶索引 {
    /**
     * 我们把符合下列属性的数组 A 称作山脉：
     * <p>
     * A.length >= 3
     * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
     * <p>
     * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：[0,1,0]
     * 输出：1
     * <p>
     * 示例 2：
     * <p>
     * 输入：[0,2,1,0]
     * 输出：1
     * <p>
     * <p>
     * <p>
     * 提示：
     * <p>
     * 3 <= A.length <= 10000
     * 0 <= A[i] <= 10^6
     * A 是如上定义的山脉
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] A = new int[]{0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(A));
    }

   /* public static int peakIndexInMountainArray(int[] A) {
        int length=A.length-1;
        for (int i = 1; i < length; i++) {
            if (A[i+1]<A[i])
                return i;
        }
        return 0;
    }*/

    public static int peakIndexInMountainArray(int[] A) {
        int middle = A.length / 2;
        while (true){
            if (A[middle]>A[middle-1]){
                if (A[middle]>A[middle+1]){
                    return middle;
                }
                middle++;
            }else {
                middle--;
            }
        }
    }
}
