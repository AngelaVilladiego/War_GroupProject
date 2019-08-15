/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author megha,2019
 * @modifier paivajo, 2019
 * @modifier AngelaVilladiego, 2019
 * @modifier sheikhash, 2019
 * @modifier Ahmadbustani, 2019
 */
public abstract class Player 
{
    private String player; //the unique ID for this player
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        player= name;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayer() 
    {
        return player;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenName the playerID to set
     */
    public void setPlayer(String givenName) 
    {
        player = givenName;
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
}
