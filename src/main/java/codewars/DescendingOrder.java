package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        int n = num;

        if (n != 0) {
            List<Integer> digits = new ArrayList<Integer>();
            while (n > 0) {
                digits.add(n % 10);
                n /= 10;
            }
            Collections.sort(digits, Collections.reverseOrder());

            StringBuilder sb = new StringBuilder();

            for (int digit : digits) {

                sb.append(digit);
            }

            return Integer.parseInt(sb.toString());
        } else {
            return 0;
        }
    }
}