package j11.leetcode;

/**
 * @author : Rubi
 * @version : 2019-03-22 16:29 下午
 */
public class 翻转图像 {

    /**
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     * <p>
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     * <p>
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [[1,1,0],[1,0,1],[0,0,0]]
     * 输出: [[1,0,0],[0,1,0],[1,1,1]]
     * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
     * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
     * <p>
     * 示例 2:
     * <p>
     * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
     * 然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * <p>
     * 说明:
     * <p>
     * 1 <= A.length = A[0].length <= 20
     * 0 <= A[i][j] <= 1
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] source = new int[][]{
                {1, 1, 0}, {1, 0, 1}, {0, 0, 0}
//                {1, 1, 0, 0},
//                {1, 0, 0, 1},
//                {0, 1, 1, 1},
//                {1, 0, 1, 0}
        };
        int[][] result = flipAndInvertImage(source);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int length1 = A.length;
        int length2 = A[0].length;
        int[][] B = new int[length1][length2];
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                B[i][j] = A[i][length2 - j - 1];
                B[i][j] = B[i][j] * -1 + 1;
            }
        }
        return B;
    }
}
