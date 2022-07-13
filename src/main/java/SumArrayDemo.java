import java.util.ArrayList;
import java.util.List;

interface i1 {
    int sum(int x, int y);
}

class SumArrayDemo {

    public static Integer[] sumArraysWithDistinct(Integer[] table1, Integer[] table2) {

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < table1.length; i++) {
            temp.add(table1[i] + table2[i]);
        }

        List<Integer> result = temp.stream().distinct().toList();
        System.out.println("result " + result);

        return result.toArray(new Integer[0]);
    }

}

