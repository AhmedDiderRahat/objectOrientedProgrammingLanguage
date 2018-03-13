import javax.swing.JFrame;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class ShowColors {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Using color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorJPanel colorJPanel=new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}