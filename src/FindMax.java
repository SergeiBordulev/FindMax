public class FindMax {
    private static double getMaxNumber(double[] array) {
        double max = array[0];

        for (double e : array) {
            if (max < e) {
                max = e;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        double[] array = {-3.2, -4.3, -6.5, -9.8, -1.5, -2.4};

        System.out.println("Maximum value in the array: " + getMaxNumber(array));
    }
}
