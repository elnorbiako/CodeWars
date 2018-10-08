package udemy;

public class TeenNumberChecker {

    public static boolean hasTeen (int first, int second, int third) {

        boolean result = false;
        if ( (first >= 13 && first <=19) || (second >= 13 && second <=19) || (third >= 13 && third <=19)  ) {
            result = true;
        }
        return result;
    }
}
