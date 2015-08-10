/**
 * Merge sorting.
 */
public class MergeSorting extends Sorting {

    @Override
    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    /**
     * Sorting method.
     * @param array array
     * @param from from index (inclusive)
     * @param to to index (inclusive)
     * @return sorted array
     */
    private int[] sort(int[] array, int from, int to) {
        int from1 = from, to1 = (to - from1) / 2 + from1,
            from2 = to1 + 1, to2 = to;
        if (to - from > 1) {
            sort(array, from1, to1);
            sort(array, from2, to2);
        }
        merge(array, from1, to1, from2, to2);
        return array;
    }

    /**
     * Merge method.
     * @param array array
     * @param from1 from1
     * @param to1 to1
     * @param from2 from2
     * @param to2 to2
     */
    private void merge(int[] array, int from1, int to1, int from2, int to2) {
        int[] merged = new int[to1 - from1 + to2 - from2 + 2];
        int i1 = from1, i2 = from2;
        for (int i = 0; i < merged.length; i++) {
            if (i1 > to1) {
                merged[i] = array[i2++];
            } else if (i2 > to2) {
                merged[i] = array[i1++];
            } else {
                if (array[i1] < array[i2]) {
                    merged[i] = array[i1++];
                } else {
                    merged[i] = array[i2++];
                }
            }
        }

        for (int i = from1; i <= to2; i++) {
            array[i] = merged[i - from1];
        }
    }
}
