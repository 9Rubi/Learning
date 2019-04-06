package j11.sort;

import java.util.Arrays;

/**
 * @author : Rubi
 * @version : 2019-04-06 15:53 下午
 */
public class 排序 {

    static int[] foo = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

    public static void main(String[] args) {
        SortExample s1 = new 冒泡排序();
        int[] result = s1.sort(foo);
        Arrays.stream(result).forEach(
                i -> System.out.print(i + ",")
        );
    }



    /**
     * <p>Bubble Sort</p>
     * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，
     * 一次比较两个元素，如果它们的顺序错误就把它们交换过来。
     * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
     * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
     */
    static class 冒泡排序 implements SortExample {
        @Override
        public int[] sort(int[] array) {
            int length = array.length;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
                    }
                }
            }
            return array;
        }
    }

    /**
     * <p>Selection Sort</p>
     * 选择排序(Selection-sort)是一种简单直观的排序算法。
     * 它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕。
     */
    static class 选择排序 implements SortExample {
        @Override
        public int[] sort(int[] array) {

            int length = array.length;
            for (int i = 0; i < length; i++) {
                int min = i;
                for (int j = i + 1; j < length; j++) {
                    if (array[min] > array[j]) {
                        min = j;
                    }
                }
                if (min != i) {
                    swap(array, min, i);
                }
            }
            return array;
        }
    }


}

