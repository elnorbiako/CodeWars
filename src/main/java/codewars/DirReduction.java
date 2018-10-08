package codewars;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {

        List<String> dir = new LinkedList<>(Arrays.asList(arr));

        while (true) {
            int len = dir.size();
            for (int i = 0; i < dir.size() - 1; i++) {
                if ("NORTH".equals(dir.get(i)) && "SOUTH".equals(dir.get(i + 1)) ||
                        "SOUTH".equals(dir.get(i)) && "NORTH".equals(dir.get(i + 1)) ||
                        "EAST".equals(dir.get(i)) && "WEST".equals(dir.get(i + 1)) ||
                        "WEST".equals(dir.get(i)) && "EAST".equals(dir.get(i + 1))) {
                    dir.remove(i);
                    dir.remove(i);
                    break;
                }
            }
            if (len == dir.size()) {
                break;
            }
        }
        return dir.toArray(new String[0]);
    }


    public static void main(String[] args) {
        System.out.println((DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})).toString());
    }
}
