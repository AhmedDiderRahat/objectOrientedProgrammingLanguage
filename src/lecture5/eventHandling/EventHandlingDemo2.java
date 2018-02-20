package lecture5.eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AD-Rahat
 */
public class EventHandlingDemo2 implements ActionListener {
    
    JFrame jfm;
    JButton b1, b2;
    
    EventHandlingDemo2() {
        jfm = new JFrame("Event Handling Demo Program");
        jfm.setSize(200, 100);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLayout(new FlowLayout());
        b1 = new JButton("Submit");
        b1.addActionListener(this);
        jfm.add(b1);
        b2 = new JButton("Cancel");
        b2.addActionListener(this);
        jfm.add(b2);
        jfm.setVisible(true);
        jfm.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Submit Button Pressed.");
        } else {
            System.out.println("Cancel Button Pressed.");
        }
    }
    
    public static void main(String args[]) {
        EventHandlingDemo2 ob = new EventHandlingDemo2();
    }
}
