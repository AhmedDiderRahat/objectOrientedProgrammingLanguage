import javax.swing.JFrame;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class Shapes2 {
     public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Shapes2JPanel shapes2JPanel=new Shapes2JPanel();
        frame.add(shapes2JPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
}
