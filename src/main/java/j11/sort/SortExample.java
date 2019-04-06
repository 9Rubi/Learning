package j11.sort;

/**
 * @author : Rubi
 * @version : 2019-04-06 15:55 下午
 */
public interface SortExample {
    default void swap(int[] array, int a, int b) {
        array[a] = array[a] + array[b];
        array[b] = array[a] - array[b];
        array[a] = array[a] - array[b];
    }

    int[] sort(int[] array);
}
