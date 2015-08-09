import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * {@link InsertSorting} test.
 */
public class InsertSortingTest extends SortingTest {

    /**
     * Test {@link InsertSorting#sort(int[])}.
     */
    @Test
    public void sortTest() {
        assertThat(new InsertSorting().sort(unsortedArray), equalTo(sortedArray));
    }
}
