package codewars;

import java.util.*;

public class ShortestWord {
    public static int findShort(String s) {

        StringTokenizer st = new StringTokenizer(s);
        List<Integer> wordsLenght = new ArrayList<>();

        while (st.hasMoreTokens()) {
            wordsLenght.add(st.nextToken().length());
        }

        Collections.sort(wordsLenght);

        return wordsLenght.get(0);

    }
}