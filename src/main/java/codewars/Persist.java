package codewars;

import java.util.ArrayList;
import java.util.List;

class Persist {

    public static int persistence(long n) {

        List<Integer> digits = getDigits(n);
        int counter = 0;

        while (digits.size() > 1) {
            int mult = digits
                    .stream()
                    .mapToInt(Integer::intValue)
                    .reduce(1, Math::multiplyExact);
            digits = getDigits(mult);
            counter++;
        }

        return counter;

    }

    public static List<Integer> getDigits(long n) {

        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add((int) (n % 10));
            n /= 10;
        }

        return digits;
    }
}