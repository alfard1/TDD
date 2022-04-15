import org.apache.commons.lang3.StringUtils;

import java.util.List;

class ListStreamDemo {

    public static List<Integer> filterEvenNumbers(List<String> list) {

        System.out.println("original list: " + list);

//        List<Integer> even = list.stream()
//                .filter(s -> StringUtils.isNumeric(s))
//                .map(s -> Integer.valueOf(s))
//                .filter(number -> number % 2 == 0)
//                .collect(Collectors.toList());

        var even = list.stream()
                .filter(StringUtils::isNumeric)
                .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("processed list, only even numbers: " + even);

        return even;
    }

}

