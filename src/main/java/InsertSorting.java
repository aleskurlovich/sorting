/**
 * Insert sorting.
 */
public class InsertSorting extends Sorting {

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int buf = array[i];
            int j = 0;
            while (array[j] < array[i]) {
                j++;
            }
            for (int k = i; k > j; k--) {
                array[k] = array[k - 1];
            }
            array[j] = buf;
        }
        return array;
    }

}
