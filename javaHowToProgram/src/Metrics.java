import javax.swing.JFrame;

/**
 *
 * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */
 
public class Metrics {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MetricsJPanel metricsJPanel=new MetricsJPanel();
        frame.add(metricsJPanel);
        frame.setSize(510, 240);
        frame.setVisible(true);        
    }
}
