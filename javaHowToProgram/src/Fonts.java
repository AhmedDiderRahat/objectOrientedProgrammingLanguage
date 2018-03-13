import javax.swing.JFrame;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class Fonts {
    public static void main(String[] args) {
        // create Frame for Font JPanel
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FontJPanel fontJpanel=new FontJPanel();
        frame.add(fontJpanel);
        frame.setSize(420, 150);
        frame.setVisible(true);
    }
}
