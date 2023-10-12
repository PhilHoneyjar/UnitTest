import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lesson6.ListAverageNumberComparator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Arrays;

public class ListAverageNumberComparatorTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        ListAverageNumberComparator comparator = new ListAverageNumberComparator();
    }

    @Test
    public void testCompareAveragesFirstListLarger() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 2.0);
        Assertions.assertEquals("The first list has a larger average",
                ListAverageNumberComparator.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAveragesSecondListLarger() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 2.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);
        Assertions.assertEquals("The second list has a higher average",
                ListAverageNumberComparator.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAveragesEqualAverages() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);
        Assertions.assertEquals("The average values are equal",
                ListAverageNumberComparator.compareAverages(list1, list2));
    }

    @AfterEach
    public void cleanUp() {
        System.setOut(null);
    }
}
