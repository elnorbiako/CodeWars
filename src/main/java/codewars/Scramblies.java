package codewars;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        List<String> scramLet = new LinkedList<String>(Arrays.asList(str1.split("") ) );
        List<String> targetLet = new LinkedList<String>(Arrays.asList(str2.split("") ) );

        boolean result = false;
        int scramOrgSize = scramLet.size();
        int targetOrgSize = targetLet.size();

        for (String letterT: targetLet) {
            if (scramLet.contains(letterT)) {
                scramLet.remove(letterT);
                }
            }


        if (scramLet.size() == (scramOrgSize - targetOrgSize ) ) {
            result = true;
        }
        return result;
    }


    public static void main(String[] args) {

        String str1 = "cedewaraaossoqqyt";
        String str2 = "codewars";

        System.out.println( scramble(str1, str2) );

    }
}

