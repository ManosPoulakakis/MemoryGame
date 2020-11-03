
package memorygame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;




public class WinPanel extends JPanel {
    ImageIcon cardBack = new ImageIcon(this.getClass().getResource("/memorygame/images/DarksidersII.jpg"));
    JLabel winner = new JLabel();
    JLabel youWon = new JLabel();
   
    
    public WinPanel(){
    setLayout(new BorderLayout(0,0));
    setBackground(Color.WHITE);
     youWon.setText("YOU WON");
     this.add(youWon,BorderLayout.SOUTH);
    
    
    
    this.add(winner,BorderLayout.NORTH);
    winner.setIcon(cardBack);
    winner.setLocation(27, 20);
 
;
    
    System.out.println("test");
    
    }
    
}
