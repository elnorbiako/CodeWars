package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SquareDigit {


    public static int squareDigits(int n) {

        List<Integer> digits = new ArrayList<Integer>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        Collections.reverse(digits);

        StringBuilder sb = new StringBuilder();

        for (int digit : digits) {

            sb.append(digit*digit);
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {

        int n = 452346;
        int test = squareDigits(n);

        System.out.println(test);

    }

}