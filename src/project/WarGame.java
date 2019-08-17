/*
 * Superclass to outline different types of war games
 */
package project;

/**
 *
 * @author Angela
 * @modifier sheikhash
 */
public abstract class WarGame extends Game{
    //data fields protected to be accessible to subclasses
    protected final String GAMENAME = "War";
    protected WarPlayer player1;
    protected WarPlayer player2;
    protected boolean inPlay;
    protected Deck deck;
    protected String scorecard;
    protected int stake;
    
    //constructor to create a game
    public WarGame(WarPlayer nPlayer1, WarPlayer nPlayer2) {
        player1 = nPlayer1;
        player2 = nPlayer2;
    }
    
    public WarGame() {}
    
    public String getGamename() {
        return GAMENAME;
    }
    
    public WarPlayer getPlayer1() {
        return player1;
    }
    
    public void setPlayer1(WarPlayer p1) {
        player1 = p1;
    }
    
    public WarPlayer getPlayer2() {
        return player2;
    }
    
    public void setPlayer2(WarPlayer p2) {
        player2 = p2;
    }
    
    public boolean inPlay() {
        return inPlay;
    }
    
    public void setInPlay(boolean play) {
        inPlay = play;
    }
    
    public abstract void warMatch();
    
    public void declareMatchWinner(WarPlayer winner) {
        System.out.println("\n" + winner.getName() + " wins the match and gained " + stake + " point(s)!");
    }

    public void declareWinner(WarPlayer winner, WarPlayer loser) {
        System.out.println("\nCongratulations " + winner.getName() + "! You won the game with a score of " +
                winner.getScore() + "! " + loser.getName() + " lost the game with just " + loser.getScore() + " points.");
    }
    
    public void declareTie() {
        System.out.println("\nStalemate! Both players have the same score!");
    }
    
    public void showScorecard() {
        System.out.println("SCORES:");
        System.out.println(player1.getName() + "'s score: " + player1.getScore());
        System.out.println(player2.getName() + "'s score: " + player2.getScore());
        System.out.println("Flips left: " + (deck.cardsLeft() / 2) + "\n");
    }
    
    public abstract void setup();
    
    public abstract void play();
}
