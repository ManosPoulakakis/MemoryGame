
package memorygame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;



public class GridPanel extends JPanel{
    
    int numButtons;
    static String pics[] = {"/memorygame/images/death.jpg","/memorygame/images/fury.jpg"
    ,"/memorygame/images/strife.jpg","/memorygame/images/thefourhorseman.jpg",
    "/memorygame/images/war.png","/memorygame/images/the4.jpg"};
    
    static JButton[] buttons ; 
    ImageIcon cardBack = new ImageIcon(this.getClass().getResource("/memorygame/images/DarksidersII.jpg"));
    ImageIcon[] icons;
    private ImageIcon temp;
    static int score = 0;
   // ScoreValue scoreValue= 
  
    //ScoreBoard scoreBoard;
    
    private boolean gameOver;
   
    Timer myTimer;
    int openImages;
    public int currentIndex;
    public int oddClickIndex;
    public int numClicks;
    private int gameTimerEnd;
    private Timer EndTimer;
    public boolean x ;
    WinPanel winPane;
    
    public GridPanel(){
    setBorder(new EmptyBorder(0,0,0,0));
    setLayout(new GridLayout(3,4,0,0));
    setBackground(Color.DARK_GRAY);
    setVisible(true);
    
    addButtons();
    
    x=false;
    
    
    }
    
    private void addButtons(){
    numButtons = pics.length * 2;
    buttons = new JButton[numButtons];
    icons = new ImageIcon[numButtons];
    
    for(int i=0,j=0;i<pics.length;i++ ){
     icons[j] = new ImageIcon(this.getClass().getResource(pics[i]));
     buttons[j] = new JButton("");
     buttons[j].addActionListener(new GridPanel.ImageButtonListener());
     buttons[j].setIcon(cardBack);
     buttons[j].setBackground(Color.BLACK);
     add(buttons[j++]);
     
     icons[j] = icons[j-1];
     buttons[j] = new JButton("");
     buttons[j].setIcon(cardBack);
     buttons[j].setBackground(Color.BLACK);
     buttons[j].addActionListener(new GridPanel.ImageButtonListener());
      add(buttons[j++]);
     
     
    }
     Random rcg = new Random();
     for (int i =0;i<numButtons;i++){
        int j = rcg.nextInt(numButtons);
        temp = icons[i];
        icons[i] = icons[j];
        icons[j] = temp;
     
     
     }
    gameTimerEnd = 60000;
    myTimer = new Timer(700,new TimerListener()); 
    EndTimer = new Timer(gameTimerEnd,gameTimer);
    EndTimer.start();
    }
private class TimerListener implements ActionListener {
     
  @Override
  public void actionPerformed(ActionEvent e){
      
    buttons[currentIndex].setIcon(cardBack);
    buttons[oddClickIndex].setIcon(cardBack);
    myTimer.stop();
  
  }
}
ActionListener gameTimer = new ActionListener(){
    public void actionPerformed(ActionEvent e){
        System.out.println("YOU RUN OUT OF TIME , YOUR GAME IS OVER");
        System.out.println("YOUR SCORE IS :"+score);
               
        System.exit(0);
       
    }

};



private class ImageButtonListener implements ActionListener{
    @Override
 public void actionPerformed(ActionEvent e){
   if (myTimer.isRunning())
       return;
   openImages++;
   System.out.println(openImages);
       
   
   for(int i =0;i<numButtons;i++){
     if(e.getSource() == buttons[i]){
     buttons[i].setIcon(icons[i]);
     currentIndex = i ; 
    }
   }
   if(openImages % 2 == 0 ){
      if(currentIndex == oddClickIndex){
        numClicks--;
        return;
      }
      if (icons[currentIndex] != icons[oddClickIndex]){
        myTimer.start();
      }
      else {
       score ++;
       System.out.println("Score:" + score);
       //scoreValue.setText(""+score);
       
        
        
      
        if (score == numButtons/2){
          setGameOver(true);
          setVisible(false);
          System.out.println("YOU WIN,YOUR SCORE IS:" +score+" WITHIN "+openImages+" MOVES ");
          x=true;
          EndTimer.stop();
          winPane.setVisible(true);
          
          
        
        } 
      }
   }
   else {
    oddClickIndex = currentIndex ;
   }
  }
 }

public static void setScore(int score){
  GridPanel.score = score ;
   }

public int getScore(){
return score;

 }

public boolean isGameOver(){
       return gameOver;
 }
public void setGameOver(boolean gameOver){
this.gameOver = gameOver;
 }

    public WinPanel getWinPane() {
        return winPane;
    }

    public void setWinPane(WinPanel winPane) {
        this.winPane = winPane;
    }

   // public ScoreValue getScoreValue() {
     //  return scoreValue;
    //}

    //public void setScoreValue(ScoreValue scoreValue) {
      // this.scoreValue = scoreValue;
    //}


}
    
    
    

