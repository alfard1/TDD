import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSorterTest {

    private static String input;

    @BeforeAll
    static void setup() {
        input = "Charlie Jennifer Charlie Bob Charlie Charlie Bob Jennifer Alice Alice";
    }

    @Test
    void outputListSizeShouldBeFour() {
        var output = StringSorter.filterNamesAndCalculate(input);
        assertEquals(4, output.size());
    }

}
