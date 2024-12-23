 //Task 9) Read a string containing letters and numbers 2, 3 and 4 (e.g. H3ello W4orld). The number in front of the character indicates how often the following character is repeated (H3ello = Heeello).
 
public class Task9 {
    public static void main(String[] args) {

        String myString = "H3ello sa4w you2 eat4ing T2ag";
        String workString = "";
        int repeatFollowing = 0;
        for (int i = 0; i < myString.length(); i++) {
            char charaterAtPoint = myString.charAt(i);
            if (Character.isDigit(charaterAtPoint)) {
                repeatFollowing = Character.getNumericValue(charaterAtPoint);
            } else {
                workString += charaterAtPoint;
                for (int j = 0; j < repeatFollowing - 1; j++) {
                    workString += charaterAtPoint;
                }
                repeatFollowing = 0;
            }

        }

        System.out.println(workString);
    }
}
