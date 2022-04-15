import java.util.List;

public class PairsFounder {

    // Write java function which calculates number of pairs in array.
    // Pair is when two numbers added together, result is zero.
    // [2, -2, 1, 0 , -1]

    public static Integer findPairs(List<Integer> list) {
        System.out.println("orginal list: " + list);

        var pairs = 0;

        for (int parentIndex = 0; parentIndex < list.size(); parentIndex++) {
            for (int childIndex = parentIndex; childIndex < list.size(); childIndex++) {
                if (list.get(parentIndex) + list.get(childIndex) == 0) {
                    pairs++;
                }
            }
        }

        System.out.println("pairs: " + pairs);

        return pairs;
    }

}
