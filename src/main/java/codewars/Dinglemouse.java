package codewars;

import java.util.*;

import com.google.common.primitives.Ints;

public class Dinglemouse {

    public static int[] sort(final int array[]) {

        TreeMap<String, Integer> sourceMap = new TreeMap<>();
        List<Integer> sortedArray = new ArrayList<>();

        for (int i : array) {
            sourceMap.put(convert(i), i);
        }

        Set set = sourceMap.entrySet();

        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
           sortedArray.add((Integer)(me.getValue()));
        }

        int[] targetArray = Ints.toArray(sortedArray);

        return targetArray;
    }

    final private  static String[] units = {"Zero","One","Two","Three","Four",
            "Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","Fourteen","Fifteen",
            "Sixteen","Seventeen","Eighteen","Nineteen"};
    final private static String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
            "Sixty","Seventy","Eighty","Ninety"};


    public static String convert(Integer i) {
        //
        if( i < 20)  return units[i];
        if( i < 100) return tens[i/10] + ((i % 10 > 0)? " " + convert(i % 10):"");
        if( i < 1000) return units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");
        if( i < 1000000) return convert(i / 1000) + " Thousand " + ((i % 1000 > 0)? " " + convert(i % 1000):"") ;
        return convert(i / 1000000) + " Million " + ((i % 1000000 > 0)? " " + convert(i % 1000000):"") ;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(Dinglemouse.sort(new int[]{8, 8, 9, 9, 10, 10})));
    }
}