import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
public class ColorJPanel extends JPanel{
        public void paintComponent( Graphics g){
            super.paintComponent(g);
            this.setBackground(Color.white);
            
            // set new drawing color using integers
            g.setColor(new Color(255, 0, 0));
            g.fillRect(15, 25, 100, 20);
            g.drawString("current RGB: "+g.getColor(), 130, 40);
            
            // set new drawing color using floats
            g.setColor(new Color(0.5f, .75f, .0f));
            g.fillRect(15, 50, 100, 20);
            g.drawString("current RGB: "+g.getColor(), 130, 65);
            
            // set new drawing color using static Color objects
            g.setColor(Color.blue);
            g.fillRect(15, 75, 100, 20);
            g.drawString("current RGB: "+g.getColor(), 130, 90);
            
            // display individual RGB values
            Color color=Color.MAGENTA;
            g.setColor(color);
            g.fillRect(15, 100, 100, 20);
            g.drawString( "RGB values: "+", " +color.getGreen()+", " +color.getBlue(),130, 115);
        } 
}
    
