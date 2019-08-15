/*
 * Superclass to outline different types of war games
 */
package project;

/**
 *
 * @author Angela
 */
public abstract class WarGame extends Game{
    //data fields protected to be accessible to subclasses
    protected final String GAMENAME = "War";
    protected WarPlayer player1;
    protected WarPlayer player2;
    protected boolean inPlay;
    protected Deck deck;
    
    //constructor to create a game
    public WarGame(WarPlayer nPlayer1, WarPlayer nPlayer2) {
        
    }
    
    public String getGamename() {
        
    }
    
    public WarPlayer getPlayer1() {
        
    }
    
    public void setPlayer1(WarPlayer p1) {
        
    }
    
    public WarPlayer getPlayer2() {
        
    }
    
    public void setPlayer2(WarPlayer p2) {
        
    }
    
    public boolean inPlay() {
        
    }
    
    public void setInPlay(boolean play) {
        
    }
    
    public void warMatch() {
        
    }
    
    public void declareMatchWinner(WarPlayer winner) {
        
    }
    
    @Override
    public void declareWinner(Player winner) {

    }
    
    public abstract void play();
}
