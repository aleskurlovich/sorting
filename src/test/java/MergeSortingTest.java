import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * {@link MergeSorting} test.
 */
public class MergeSortingTest extends SortingTest {

    /**
     * Test {@link MergeSorting#sort(int[])}.
     */
    @Test
    public void sortTest() {
        assertThat(new MergeSorting().sort(unsortedArray), equalTo(sortedArray));
    }
}
