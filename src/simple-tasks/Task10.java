
import edu.princeton.cs.introcs.StdDraw;

/**
 * Task 10) Draw a number of circles. The outermost circle must be grey and the further inside the darker the circle becomes.
 */
public class Task10 {
    public static void main(final String[] args) {

        final int numberOfCircles = 7;
        int color = 235;
        final int stepsColor = color / numberOfCircles;
        final int baseRadius = 500 / 2;
        final int stepRadius = (baseRadius) / numberOfCircles;


        StdDraw.setCanvasSize(500, 500);
        StdDraw.setScale(0.0, 500.0);

        for (int i = 0; i < numberOfCircles; i++, color -= stepsColor) {
            StdDraw.setPenColor(color, color, color);
            StdDraw.filledCircle(250, 250, baseRadius -(i*stepRadius));
        }

    }

}

