package codewars;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {

        StringBuilder sb = new StringBuilder();
        for (int i =1; i<= repeat; i++) {
           sb.append(string);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(5, "A"));
    }
}
