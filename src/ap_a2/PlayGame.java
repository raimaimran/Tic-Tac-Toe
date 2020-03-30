package ap_a2;


public class PlayGame {

    int PlayerNumber = 1; 
    PlayGame(){
        
       // new GameClass().setVisible(true);
    }
    
    public int getPlayer(){
        return PlayerNumber;
    }
    
    public void player1Turn(){
        
        //user playing the game's turn
        PlayerNumber = 1;
        
    }
    
    public void player2Turn(){
        PlayerNumber = 2;
    }
    
}
