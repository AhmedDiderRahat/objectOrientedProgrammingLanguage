import javax.swing.JFrame;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class Shapes {
     public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShapesJPanel shapesJPanel=new ShapesJPanel();
        frame.add(shapesJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
}
