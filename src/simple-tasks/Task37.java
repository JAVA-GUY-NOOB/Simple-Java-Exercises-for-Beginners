/**
 * Task 37) Write a method to remove duplicate elements from an array.
 */
public class Task37 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] newArray = removeDuplicates(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int[] newArray = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newArray.length; j++) {
                if (array[i] == newArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}
