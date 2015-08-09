import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * {@link SelectionSorting} test.
 */
public class SelectionSortingTest extends SortingTest {

    /**
     * {@link SelectionSorting#sort(int[])} test.
     */
    @Test
    public void sortTest() {
        assertThat(new SelectionSorting().sort(unsortedArray), equalTo(sortedArray));
    }

}
