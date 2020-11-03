
package memorygame;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class GamePanel extends JPanel {
    GridPanel gridPane;
    WinPanel winPane;
    ScoreBoard scoreBoard ;
   
    
    GamePanel(){
   
    setLayout(new BorderLayout(0,0));
    gridPane = new GridPanel();
    add(gridPane, BorderLayout.CENTER);
   
    
    
    winPane = new WinPanel();
    add(winPane,BorderLayout.NORTH);
    winPane.setVisible(false);
    gridPane.setWinPane(winPane);    
        
    

    }

    public ScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public void setScoreBoard(ScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }
  

}
