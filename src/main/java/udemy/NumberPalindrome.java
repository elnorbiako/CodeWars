package udemy;

public class NumberPalindrome {

    public static boolean isPalindorme (int number) {
        int reversenum = 0;
        int num = number;
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        return(number == reversenum);
    }

    public static void main(String[] args) {
        System.out.println(isPalindorme(-1221));
    }
}
