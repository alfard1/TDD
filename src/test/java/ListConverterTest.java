import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ListConverterTest {

    private static final List<String> list = new ArrayList<>();
    private static String prefix;

    @BeforeAll
    static void setup() {
        list.add("bob");
        list.add("bobby");
        list.add("kevin");
        list.add("kevin1");
        list.add("bob2");
        prefix = "bo";
    }

    @Test
    void inputShouldNotBeEmpty() {
        var map = ListConverter.createMap(list, prefix);
        assertEquals(list.size(), 5);
        assertNotNull(prefix);
    }

    @Test
    void shouldSelectThreeItemsWithPrefixBo() {
        var map = ListConverter.createMap(list, prefix);
        assertEquals(map.size(), 3);
    }

    @Test
    void shouldCreateExpectedResult() {
        var map = ListConverter.createMap(list, prefix);
        assertEquals(map.get("bob"), "2");
        assertEquals(map.get("bobby"), "3");
        assertEquals(map.get("bob2"), "3");
    }

}
