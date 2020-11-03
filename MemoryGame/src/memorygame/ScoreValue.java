/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import javax.swing.JLabel;

/**
 *
 * @author dragon
 */
public class ScoreValue extends JLabel {
    public  int score;
    
    
    public ScoreValue(){
    this.setText(""+score);
    }

    public int getScore() {
        return score;
    }

    public void setScoreValue(int score) {
        this.score = score;
    }

   
    
    
}
