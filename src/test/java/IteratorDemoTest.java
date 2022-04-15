import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IteratorDemoTest {

    private static List<String> list = new ArrayList<>();

    @BeforeAll
    static void setup() {
        list = List.of("1", "2", "3", "4", "5", "6");
    }

    @Test
    void outputListSizeShouldBeMoreThanThree() {
        var even = ListStreamDemo.filterEvenNumbers(list);
        assertTrue(even.size() >= 3);
    }

    @Test
    void shouldNotThrowExceptionWhenNotNumericString() {
        var input = List.of("2", "asd");
        ListStreamDemo.filterEvenNumbers(input);
    }
}
