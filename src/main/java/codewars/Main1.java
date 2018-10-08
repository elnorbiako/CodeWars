package codewars;

import java.util.Arrays;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        String test = "101010100010001110101110000000111";

        List<String> signals = Arrays.asList(test.split("(?<=(.))(?!\\1)"));
        StringBuilder sb = new StringBuilder();

        for (String signal: signals) {

            if (signal.equals("111")) {
                sb.append("-");
            } else if (signal.equals("1")) {
                sb.append(".");
            } else if (signal.equals("000")) {
                sb.append(" ");
            } else if (signal.equals("0000000")) {
                sb.append("   ");
            }

        }
        System.out.println(sb.toString());
    }

}
