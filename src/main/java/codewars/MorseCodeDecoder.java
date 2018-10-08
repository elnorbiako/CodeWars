package codewars;

import java.util.Arrays;
import java.util.List;

public class MorseCodeDecoder {
    public static String decodeBits(String bits) {
        String noZeros = bits.replaceFirst("^0*", "").replaceFirst("0*$", "");
        String properBits = removeMulti(noZeros, findShortestLenght(noZeros) );
        List<String> signals = Arrays.asList(properBits.split("(?<=(.))(?!\\1)"));
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
        return sb.toString();
    }

    public static String decodeMorse(String morseCode) {
        List<String> morseLetters = Arrays.asList(morseCode.trim().split(" ", 0));
        StringBuilder sb = new StringBuilder();
        for (String letter: morseLetters) {
            if(letter.equals("")) {
                sb.append(" ");
            } else {
 //               sb.append(MorseCode.get(letter));
            }
        }
        return sb.toString().replaceAll("  ", " ");
    }

    public static int findShortestLenght(String bits) {
        int counter = 100;
        int tempCounter = 1;
        for (int i = 1; i < bits.length(); i++) {
            if (bits.charAt(i - 1) == bits.charAt(i)) {
                tempCounter++;
            } else {
                if (tempCounter < counter) {
                    counter = tempCounter;

                }
                tempCounter = 1;
            }
        }
        return counter;
    }

    public static String removeMulti(String bits, int multipl) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bits.length(); i++) {
            if (i%multipl == 0) {
                sb.append(bits.charAt(i));
            }
        }
        return sb.toString();
    }
}