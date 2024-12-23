import java.util.Arrays;
/**
 * Task 31) Write a Java program to sort a numeric array
 */
public class Task31 {

    public  static void main(final String[] args) {
int[] a = {3, 2, 5, 4, 1};
        System.out.println("Original Array: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));
    }
} 
