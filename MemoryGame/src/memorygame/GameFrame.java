
package memorygame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
        
public class GameFrame extends JFrame {
    private GamePanel gp;
    private ScoreBoard scoreBoard;
    
    public GameFrame(){
    
    setTitle("MemoryGame");
    setBackground(Color.WHITE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100,200,1200,600);
    setIconImage(Toolkit.getDefaultToolkit()
            .getImage(GameFrame.class
            .getResource("/memorygame/images/death.jpg")));
     gp = new GamePanel();
     setContentPane(gp);
     gp.setScoreBoard(scoreBoard);
    
    }

    public ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public void setScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }
    
}