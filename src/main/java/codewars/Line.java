package codewars;

public class Line {
    public static String WhoIsNext(String[] names, int n) {

        int nextIteration = 5, iterations = 1;
        while (n - nextIteration > 0) {
            n -= nextIteration;
            nextIteration *= 2;
            iterations *= 2;
        }
        return names[(n - 1) / iterations];
    }


    public static void main(String[] args) {

        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = 72307223;

        System.out.println(WhoIsNext(names, n));

    }
}