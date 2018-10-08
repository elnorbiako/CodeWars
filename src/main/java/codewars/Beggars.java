package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Beggars {

    public static int[] beggars(int[] values, int n) {

        List<Integer> valuesList = Arrays.stream(values).boxed().collect(Collectors.toList());
        int[] result = new int[n];

        if (n == 0) {
            return result;
        }

        while (true) {
            for (int i = 0; i < n; i++) {
                result[i] = (result[i]+valuesList.get(0));
                valuesList.remove(0);
                if (valuesList.size() == 0) {
                    return result;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};

        System.out.println(Arrays.toString(beggars(test, 0)));
    }


}
