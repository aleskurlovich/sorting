import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * {@link QuickSorting} test.
 */
public class QuickSortingTest extends SortingTest {

    /**
     * Test {@link QuickSorting#sort(int[])}.
     */
    @Test
    public void sortTest() {
        assertThat(new QuickSorting().sort(unsortedArray), equalTo(sortedArray));
    }

}
