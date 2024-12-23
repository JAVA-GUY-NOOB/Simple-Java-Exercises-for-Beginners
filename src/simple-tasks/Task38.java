/**
 * Task 38) Write a method that counts how often an element occurs in an array
 * For example:
 * int[] a = { 3, 5, 4, 6, 6, 2, 3, 4, 2, 3 }
 * countOccurs(a,3)   // should return 4;
 */
public class Task38 {
    public static void main(String[] args) {
        int[] a = { 3, 5, 4, 6, 3, 2, 3, 4, 2, 3 };
        System.out.println(countOccurs(a, 3));
    }

    public static int countOccurs(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        return count;
    }
}
