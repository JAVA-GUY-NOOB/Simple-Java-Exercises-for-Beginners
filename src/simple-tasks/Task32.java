
/**
 * Task 32) Write a method to sum values of an int array
 */
public class Task32 {

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 4, 1};

        int sum = sumArray(a);
        System.out.println(sum);
    }
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    return sum;
    }

}
