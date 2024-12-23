/**
 * Task 35) Write a Method to insert an element (specific position) into an array. The signature of the Method should be insertElement(String[] array, int position)
 * Please check if the position is valid before inserting!
 */
public class Task35 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        a = insertVal(a, 5, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
    }

    private static int[] insertVal(int[] a, int val, int pos) {
        if (pos < 0 || pos > a.length) {
            System.out.println("Invalid position! can't insert element.");
            return a;
        }
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < pos; i++) {
            newArray[i] = a[i];
        }
        newArray[pos] = val;
        for (int i = pos; i < a.length; i++) {
            newArray[i + 1] = a[i];
        }
        return newArray;
    }
}