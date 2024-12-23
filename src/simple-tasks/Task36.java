/**
 * Task 36) Write a method to find the maximum value of an array in a given interval.
 * For example:
 * 4 2 5 5 1 3 2
 * maximum from interval index 3 - 5 is 3
 */
public class Task36 {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 5, 1, 3, 2};
        System.out.println("Maximum from interval index 3 - 5 is " + findMax(array, 3, 5));
    }

    public static int findMax(int[] array, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
