import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class FontJPanel extends JPanel{    
    //Display String in differnt font and color
    public void paintComponent(Graphics g){
        super.paintComponent(g);// call superclass's paintComponent
        //set font to serif(times),BOLD,12pt and draw a string
        g.setFont(new Font("Serif",Font.BOLD,12));
        g.drawString("Serif 12 points bold", 20, 30);
        
        // set font to Monospaced (Courier), italic, 24pt and draw a string
        g.setFont(new Font("Monospaced",Font.BOLD,24));
        g.drawString("Monospaced 24 points bold", 20, 50);
        
        // set font to Serif (Times), bold/italic, 18pt and draw a string
        g.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,18));
        g.drawString(g.getFont().getName()+" "+g.getFont().getSize()+"Serif 12 points bold", 20, 90);
    }
}

