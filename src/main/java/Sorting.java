/**
 * Abstract sorting class.
 */
public abstract class Sorting {

    /**
     * Sorting method.
     * @param array unsorted array
     * @return sorted array
     */
    public abstract int[] sort(int[] array);

    /**
     * Swap method.
     * @param array array
     * @param i i index
     * @param j j index
     */
    void swap(int[] array, int i, int j) {
        int buf = array[i];
        array[i] = array[j];
        array[j] = buf;
    }
}
