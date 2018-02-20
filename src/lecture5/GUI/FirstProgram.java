package lecture5.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author AD-Rahat
 */
public class FirstProgram {

    JFrame jfm;
    JLabel j1;

    FirstProgram() {
        jfm = new JFrame("First Swing Program");
        jfm.setSize(600, 450);
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setResizable(false);
        j1 = new JLabel("Hello World", JLabel.CENTER);
        jfm.add(j1);
        jfm.setVisible(true);

        jfm.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        FirstProgram ob = new FirstProgram();
    }
}
