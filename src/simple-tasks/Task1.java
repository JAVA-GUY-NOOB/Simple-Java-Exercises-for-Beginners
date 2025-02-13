/*
Task 1) Output any string mirrored
*/
public class Task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        final String myString = "BOOB AND ASS";

        for (int i = (myString.length() - 1); i >= 0; i--) {
            System.out.print(myString.charAt(i));
        }
    }

    @Override
    public String toString() {
        return "Task1 []";
    }
}

   
   
   
   
   
   
   

