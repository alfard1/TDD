import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListConvertToMap {

// - Create a function that takes in a list of names and a prefix.
// - Filter the list of names by the prefix so that you only retain the names that start with that prefix.
// - The functions should return a map with the name as a key and the value as the distinct character count.
// - E.g. list ("bob", "bobby", "kevin") and prefix = "bo" gives
//   Map: "bob" -> 2, "bobby" -> 3


    public static Map<String, String> createMap(List<String> list, String prefix) {

        Map<String, String> map = new HashMap<>();

        list.forEach(s -> {
            if (s.indexOf(prefix) == 0) {
                var length = s.chars().distinct().toArray().length;
                map.put(s, String.valueOf(length));

            }
        });

        return map;
    }

}

