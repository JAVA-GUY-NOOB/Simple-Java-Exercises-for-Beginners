/*
 Zeichne n * n Kreise. In der Diagonale sollen die Kreise getrennt sein. Sprich eine Seite soll grün sein und die Andere soll blau sein.
 Das Fester soll mit einer Fixen breite von 400 Pixel sein. Die größe der Kreise soll propertional zu der Anzahl sein.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Task30 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int count = 5;
        int size = getWidth();
        int radiusCircel = (size / count) / 2;
        int anzBlue = 0;
        for (int i = 0, xpos = radiusCircel; i < count; i++, anzBlue++, xpos += 2 * radiusCircel) {
            for (int j = 0; j < anzBlue; j++) {
                g.setColor(Color.BLUE);
                g.drawOval(radiusCircel + radiusCircel * 2 * j, radiusCircel + radiusCircel * 2 * i, radiusCircel * 2, radiusCircel * 2);
            }
            for (int j = 0; j < count - anzBlue; j++) {
                g.setColor(Color.GREEN);
                g.drawOval(xpos + radiusCircel * 2 * j, radiusCircel + radiusCircel * 2 * i, radiusCircel * 2, radiusCircel * 2);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Task30());
        frame.setVisible(true);
    }

}
