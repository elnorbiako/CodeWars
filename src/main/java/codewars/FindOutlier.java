package codewars;

import java.util.ArrayList;
import java.util.List;

public class FindOutlier {

    static int find(int[] integers) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int integer : integers) {
            if (integer % 2 == 0) {
                evenNumbers.add(integer);
            } else {
                oddNumbers.add(integer);
            }
        }

        if (evenNumbers.size() == 1) {
            return evenNumbers.get(0);
        } else {
            return oddNumbers.get(0);
        }

    }
}