import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
/**
 * Task 3) Output several squares (number according to a variable) in an output window, where a certain distance from the edge is given and the squares must also have the same distance from each other.
 */
public class Task3 {
    public static void main(String[] args) {

        int squares = 4;
        int spacing = 20;

        int width = 400;
        int height = 400;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, 400);
        StdDraw.setYscale(0, 400);


        int widthPerSquare = (width - ((squares + 1) * spacing)) / 4; // jedes Square soll gleich breit sein und soll den selben abstand zwischen sich haben und zum rand

        for (int yPosition = spacing; yPosition < height - spacing; yPosition += widthPerSquare + spacing) {
            for (int i = 0, xPosition = spacing; i < squares; i++, xPosition += widthPerSquare + spacing) {

                StdDraw.setPenColor(Color.red);
                StdDraw.filledSquare(xPosition + widthPerSquare / 2, yPosition + widthPerSquare / 2, widthPerSquare / 2);


            }
        }


        StdDraw.show();
    }
}

