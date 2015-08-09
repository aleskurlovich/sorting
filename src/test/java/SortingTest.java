import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

/**
 * Base sorting test.
 */
@RunWith(Parameterized.class)
@Ignore
public class SortingTest {

    /**
     * Unsorted array.
     */
    @Parameter(0)
    public int[] unsortedArray;

    /**
     * Sorted array.
     */
    @Parameter(1)
    public int[] sortedArray;

    /**
     * Data generator.
     * @return generator
     */
    @Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][]{
                {
                        new int[]{0, 1, 2, 3, 4, 5},
                        new int[]{0, 1, 2, 3, 4, 5}
                },
                {
                        new int[]{5, 4, 3, 2, 1, 0},
                        new int[]{0, 1, 2, 3, 4, 5}
                },
                {
                        new int[]{1, 4, 3, 5, 2, 0},
                        new int[]{0, 1, 2, 3, 4, 5}
                }
        });
    }

}
