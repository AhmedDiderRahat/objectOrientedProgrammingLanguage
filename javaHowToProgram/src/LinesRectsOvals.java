import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class LinesRectsOvals {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Drawing lines, rectangle and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LinesRectsOvalsJPanel linesRectsOvalsJPanel=new LinesRectsOvalsJPanel();
        linesRectsOvalsJPanel.setBackground(Color.WHITE);
        frame.add(linesRectsOvalsJPanel);
        frame.setSize(400, 210);
        frame.setVisible(true);
    }
}
