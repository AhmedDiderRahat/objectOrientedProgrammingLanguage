package lecture5.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author AD-Rahat
 */
public class SecondProgram {

    JFrame jfm;
    JButton b1, b2;

    SecondProgram() {
        jfm = new JFrame("First Swing Program");
        jfm.setSize(200, 200);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        jfm.setLayout(new FlowLayout());

        b1 = new JButton("Yes");
        jfm.add(b1);
        b2 = new JButton("No");
        jfm.add(b2);

        jfm.setVisible(true);
        jfm.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        SecondProgram ob = new SecondProgram();
    }
}
