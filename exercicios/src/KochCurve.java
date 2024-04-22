import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class KochCurve extends JFrame {

    private final int level;

    public KochCurve(int level) {
        this.level = level;
        setTitle("Koch Curve");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawKochCurve(g, level, 50, 300, 550, 300);
    }

    private void drawKochCurve(Graphics g, int level, int x1, int y1, int x5, int y5) {
        if (level == 0) {
            g.drawLine(x1, y1, x5, y5);
        } else {
            int deltaX = x5 - x1;
            int deltaY = y5 - y1;

            int x2 = x1 + deltaX / 3;
            int y2 = y1 + deltaY / 3;

            int x3 = (int) (0.5 * (x1 + x5) + Math.sqrt(3) * (y1 - y5) / 6);
            int y3 = (int) (0.5 * (y1 + y5) + Math.sqrt(3) * (x5 - x1) / 6);

            int x4 = x1 + 2 * deltaX / 3;
            int y4 = y1 + 2 * deltaY / 3;

            drawKochCurve(g, level - 1, x1, y1, x2, y2);
            drawKochCurve(g, level - 1, x2, y2, x3, y3);
            drawKochCurve(g, level - 1, x3, y3, x4, y4);
            drawKochCurve(g, level - 1, x4, y4, x5, y5);
        }
    }

    public static void main(String[] args) {
        int level = 0; // Change the level to adjust the complexity of the curve
        SwingUtilities.invokeLater(() -> {
            KochCurve curve = new KochCurve(level);
            curve.setVisible(true);
        });
    }
}
