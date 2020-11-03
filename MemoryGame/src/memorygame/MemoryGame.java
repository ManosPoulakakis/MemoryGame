package memorygame;

import java.awt.EventQueue;
import javax.swing.JFrame;
public class MemoryGame extends JFrame {
    
    

 
    public static void main(String[] args) {
       
        EventQueue.invokeLater(() -> {
            try { 
                GameFrame game = new GameFrame();
                game.setVisible(true);
                 ScoreBoard score = new ScoreBoard();
                 score.setVisible(true);   
                 game.setScoreBoard(score);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        });
        
        
        
        
        
    }
    
}
