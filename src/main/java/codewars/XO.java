package codewars;


public class XO {

    public static boolean getXO (String str) {

        String strLow = str.toLowerCase();

        long countX = strLow.chars().filter(ch -> ch == 'x').count();
        long countO = strLow.chars().filter(ch -> ch == 'o').count();

        boolean ifSame = false;

        if (countO == countX) {
            ifSame = true;
        }


        // Good Luck!!


        return ifSame;
    }
}