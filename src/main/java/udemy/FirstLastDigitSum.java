package udemy;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number <0) {
            return -1;
        }

        String strNumber = String.valueOf(number);
        int first = Integer.parseInt(String.valueOf(strNumber.charAt(0)));
        int last = Integer.parseInt(String.valueOf(strNumber.charAt(strNumber.length()-1)));

        return (first + last);
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10) );
    }
}
