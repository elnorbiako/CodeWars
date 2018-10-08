package codewars;


import java.util.ArrayList;
import java.util.List;

public class DRoot {
    public static int digital_root(int n) {

        List<Integer> digits = getDigits(n);

        if (digits.size() == 0) {
            return 0;
        }

        else {
            while (digits.size() > 1) {
                int sum = digits
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum();
                digits = getDigits(sum);

            }

            return digits.get(0);
        }
    }

    public static List<Integer> getDigits(int n) {

        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }

        return digits;
    }

}