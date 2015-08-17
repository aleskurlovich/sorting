/**
 * Quick sorting.
 */
public class QuickSorting extends Sorting {

    @Override
    public int[] sort(int[] array) {
        return sort(array, 0 , array.length - 1);
    }

    private int[] sort(int[] array, int from, int to) {
        int i = from, j = to, pivot = array[(from + to) / 2];
        do {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i++, j--);
            }

        } while (i <= j);
        if (from < j) {
            sort(array, from, j);
        }
        if (i < to) {
            sort(array, i, to);
        }
        return array;
    }

}
