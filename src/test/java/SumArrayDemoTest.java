import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumArrayDemoTest {

    private static final Integer[] table1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final Integer[] table2 = new Integer[]{22, 21, 20, 52, 61, 72, 81, 91, 10, 11};

    @Test
    void outputArraySizeShouldHaveEightElements() {
        var sum = SumArrayDemo.sumArraysWithDistinct(table1, table2);
        assertEquals(8, sum.length);
    }

}
