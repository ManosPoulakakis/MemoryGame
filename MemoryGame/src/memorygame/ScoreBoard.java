/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;


import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author dragon
 */
public class ScoreBoard extends JFrame {
    private JLabel score;
    private JPanel panel;
    private JLabel scoreValue;
   
    
   
    public ScoreBoard(){
       
       panel = new JPanel(new BorderLayout());
       score = new JLabel("Score : "+GridPanel.score);
       scoreValue = new ScoreValue();
       initScore();
       panel.add(score,BorderLayout.NORTH);
       panel.add(scoreValue);
       add(panel);
         
    setBounds(1286,200,45,105);
    
  
      
      
       
      
    
    }
    private void initScore(){
      score.setText("Score:");
      score.setToolTipText("Score Points");
      
    
    }
    
    
     
     
     }

    

  
    
     
     
     
   

 