package udemy;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        double roundOffFirst = Math.floor(first * 1000) / 1000;
        double roundOffSecond = Math.floor(second * 1000) / 1000;

        return (roundOffFirst == roundOffSecond);
    }

}
