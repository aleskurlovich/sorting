/**
 * Selection sorting implementation.
 */
public class SelectionSorting extends Sorting {

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            swap(array, i, k);
        }
        return array;
    }

}
