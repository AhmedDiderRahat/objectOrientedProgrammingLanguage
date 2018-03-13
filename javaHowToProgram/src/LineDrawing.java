import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class LineDrawing extends JPanel{
    public void paintComponent( Graphics g){
        super.paintComponent(g);
        g.drawLine(1, 1, 10, 10);        
    }
}
