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
    private String name; //the unique ID for this player
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String nName)
    {
        name = nName;
    }
    
    /**
     * @return the playerID
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setName(String givenID) 
    {
        name = givenID;
    }    
}
