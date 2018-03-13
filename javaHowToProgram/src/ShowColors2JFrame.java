import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
  * @author Ahmed Dider Rahat && Aziz Ahmed Chowdhury
 */

 public class ShowColors2JFrame extends JFrame{
    private JButton changeColorJButton;
    private Color color=Color.DARK_GRAY;
    private JPanel colorJPanel;
    
    // set up GUI
    public ShowColors2JFrame(){
        super("Using JColorChooser");
        colorJPanel=new JPanel();
        colorJPanel.setBackground(color);
        
        // set up changeColorJButton and register its event handler
        changeColorJButton=new JButton("Change color");
        changeColorJButton.addActionListener(
                new ActionListener() //annonimus inner class
                {
					// display JColorChooser when user clicks button							
					@Override
					public void actionPerformed(ActionEvent event) {
						color=JColorChooser.showDialog(ShowColors2JFrame.this,"Change a color", color);
						if(color==null)
							color=Color.DARK_GRAY;
						// change content pane's background color
						colorJPanel.setBackground(color);
					}
				}
        );
        
        add(colorJPanel, BorderLayout.CENTER);// add color JPanel
        add(changeColorJButton, BorderLayout.SOUTH);// add button
        setSize(400, 130);
        setVisible(true);        
    }    
}
