import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PairsFounderTest {

    private static List<Integer> list = new ArrayList<>();

    @BeforeAll
    static void setup() {
        list = List.of(2, -2, 0, -1);
    }

    @Test
    void outputListSizeShouldBeMoreThanOne() {
        assertTrue(list.size() > 0);
    }

    @Test
    void returnedNumberOfPairsShouldBeTwo() {
        var result = PairsFounder.findPairs(list);
        assertEquals(2, result);
    }

}
