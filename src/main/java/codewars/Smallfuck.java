package codewars;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Smallfuck {
    public static String interpreter(String code, String tape) {

        int cell = 0;
        List<String> tapeList = new LinkedList<String>(Arrays.asList(tape.split("")));

        for (int i = 0; i < code.length(); i++) {
            char chr = code.charAt(i);
            if (chr == '>') {
                cell++;
            } else if (chr == '<') {
                cell--;
            } else if (cell < 0 || cell > (tapeList.size() - 1) ) {
                return StringUtils.join(tapeList, "");
            } else if (chr == '*') {
                if (tapeList.get(cell).equals("1")) {
                    tapeList.set(cell, "0");
                } else if (tapeList.get(cell).equals("0")) {
                    tapeList.set(cell, "1");
                }
            }
        }
        return StringUtils.join(tapeList, "");
    }

}