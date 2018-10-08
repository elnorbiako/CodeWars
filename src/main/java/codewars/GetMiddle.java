package codewars;

public class GetMiddle {

    public static String getMiddle(String word) {
        int length = word.length();
        StringBuilder sb = new StringBuilder();
        if (length %2 == 0) {
           sb.append(word.charAt((length/2)-1));
            sb.append(word.charAt(length/2));
            return sb.toString();
        } else {

            sb.append(word.charAt(length/2));
            return sb.toString();
        }
    }
}
