package udemy;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ( (bigCount < 0) || (smallCount < 0) || (goal <0) ) {
            return false;
        }

        int goalBig = goal/5;
        int goalSmall = goal%5;

        if ( ( (bigCount * 5) == goal ) || (smallCount == goal) ) {
            return true;
        }
//        } else if ()

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }
}
