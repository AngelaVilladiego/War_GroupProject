/*
 * The object for the player object used in the war game
 */
package project;

/**
 *
 * @author Angela
 */
public class WarPlayer extends Player{
    //data members
    private boolean hasPlayed = false;
    private int score = 0;
    private Card card;
    
    //constructor
    public WarPlayer(String nName) {
        super(nName);
    }
    
    //check if player has played
    public boolean hasPlayed() {
        return hasPlayed;
    }
    
    //set if player has playd
    public void setPlayed(boolean played) {
        hasPlayed = played;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int nScore) {
        score = nScore;
    }
    
    public Card getCard() {
        return card;
    }
    
    public void setCard(Card nCard) {
        card = nCard;
    }
}
