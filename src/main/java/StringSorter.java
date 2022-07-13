import java.util.*;
import java.util.stream.Collectors;

public class StringSorter {

    // Input:
    // Charlie Jennifer Charlie Bob Charlie Charlie Bob Jennifer Alice Alice

    // Output:
    // Charlie 4
    // Alice 2
    // Bob 2
    // Jennifer 2

    // porównać z http://download.oracle.com/javase/6/docs/api/java/lang/String.html#split%28java.lang.String%29

    public static Map<String, Integer> filterNamesAndCalculate(String input) {

        var list = convertStringToList(input);
        var map = convertToMapAndCount(list);
        var sortedMap = sortMapByKeyAndValue(map);
        printMap(sortedMap);
        return sortedMap;
    }

    private static void printMap(Map<String, Integer> input) {
        input.forEach((s, integer) -> {
            System.out.println(s + " " + integer);
        });
    }

    private static Map<String, Integer> sortMapByKeyAndValue(Map<String, Integer> input) {
        return input.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    private static Map<String, Integer> convertToMapAndCount(List<String> list) {
        Map<String, Integer> outputList = new HashMap<>();
        list.forEach(e -> {
            if (!outputList.containsKey(e)) {
                outputList.put(e, 1);
            } else {
                Integer tempValue = outputList.get(e);
                outputList.put(e, ++tempValue);
            }
        });
        return outputList;
    }

    private static List<String> convertStringToList(String input) {
        return new ArrayList<>(Arrays.asList(input.split(" ")));
    }

}
