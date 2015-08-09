import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * {@link BubbleSorting} test.
 */
public class BubbleSortingTest extends SortingTest {

    /**
     * Test {@link BubbleSorting#sort(int[])}.
     */
    @Test
    public void sortTest() {
        assertThat(new BubbleSorting().sort(unsortedArray), equalTo(sortedArray));
    }

}
