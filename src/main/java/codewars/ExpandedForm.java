package codewars;

import static java.lang.String.join;

public class ExpandedForm {

    public static String expandedForm(int num)
    {
        //your code here
        String wholeNumber = String.valueOf(num);
        StringBuilder sb = new StringBuilder();


        for (int i=0; i < wholeNumber.length(); i++ ) {
            if (Integer.parseInt(String.valueOf(wholeNumber.charAt(i))) != 0) {
                sb.append(wholeNumber.charAt(i));
                for (int j=0; j < (wholeNumber.length()-1-i); j++) {
                    sb.append(0);
                }

                sb.append(" + ");
            }
        }
        String result = sb.toString();

        return result.substring(0, result.length()-3);
    }


    public static void main(String[] args) {

        int num = 10023;
        System.out.println(expandedForm(num));
    }
}