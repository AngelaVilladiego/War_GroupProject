/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author megha, 2019
 * @modifier paivajo, 2019
 * @modifier AngelaVilladiego, 2019
 * @modifier sheikhash, 2019
 * @modifier Ahmadbustani, 2019
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    public enum Suits{HEARTS,DIAMONDS,SPADES,CLUBS};
    private int value;
    private String name;
    private final Suits suits;
    
    Card(Suits cSuit, int cValue){
         
         suits = cSuit;
         value = cValue;
     }
    
    public int getValue(){
        
        return value;
    }
    
    public int setValue(int cardValue){
        
       return value = cardValue;
       
    }
    
    public String getName(){
        
        return name;
    }
    
    public String setName(String cardName){
        
        return cardName;
    }
    
    public Suits getSuit (){
        
        return suits;
    }
    
    
    @Override
    public abstract String toString();
    
}
