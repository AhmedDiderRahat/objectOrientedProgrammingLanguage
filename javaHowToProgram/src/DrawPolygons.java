import javax.swing.JFrame;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class DrawPolygons {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PolygonsJPanel polygonsJPanel=new PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
}
