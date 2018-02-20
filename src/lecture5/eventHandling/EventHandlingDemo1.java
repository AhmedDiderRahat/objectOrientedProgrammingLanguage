package lecture5.eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author AD-Rahat
 */
public class EventHandlingDemo1 implements ActionListener {

    JFrame jfm;
    JButton b1;

    EventHandlingDemo1() {
        jfm = new JFrame("Event Handling Demo Program");
        jfm.setSize(200, 100);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLayout(new FlowLayout());

        b1 = new JButton("Click me");
        b1.addActionListener(this);
        jfm.add(b1);

        jfm.setVisible(true);
        jfm.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae) {
        System.out.println("Clicked");
    }

    public static void main(String args[]) {
        EventHandlingDemo1 ob = new EventHandlingDemo1();
    }
}
