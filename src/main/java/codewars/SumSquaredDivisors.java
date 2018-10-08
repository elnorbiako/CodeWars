package codewars;

import java.util.ArrayList;

import java.util.List;


public class SumSquaredDivisors {


    public static void main(String[] args) {
        System.out.println(listSquared(1, 250));
    }

    public static String listSquared(long m, long n) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        List<Long> squaredDivisors = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            List<Long> divisors = findDivisors(i);
            squaredDivisors.clear();
            for (long divisor : divisors) {
                squaredDivisors.add((long) Math.pow(divisor, 2));
            }

            long sumOfDivisors = sumDivisors(squaredDivisors);

            if (isPerfectSquare(sumOfDivisors)) {
                sb.append("[" + i + ", " + sumOfDivisors + "], ");
            }
        }
        if (sb.length()>2) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");

        return sb.toString();
    }


    public static List<Long> findDivisors(long x) {

        List<Long> divisors = new ArrayList<>();

        for (long i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }

    public static long sumDivisors(List<Long> divisors) {

        return divisors.stream().mapToLong(value -> value).sum();
    }

    public static boolean isPerfectSquare(long input) {
        long SquareRoot = (long) Math.sqrt(input);
        return ((SquareRoot * SquareRoot) == input);
    }

}
