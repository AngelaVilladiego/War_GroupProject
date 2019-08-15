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
 */
public class Card {
    private int value;
    private Suits suit;
    
    //constructor to create a card with given suit and value
    Card(int cValue, Suits cSuit) {
         suit = cSuit;
         value = cValue;
     }
    
    //Overriding the toString method to print card type in format ex. "Ace of Spades"
    @Override
    public String toString(){
        String name;
        
        //switch case value of card
        switch(value) {
            case 1:
                name = "Ace";
                break;
            
            case 11:
                name = "Jack";
                break;
            
            case 12:
                name = "Queen";
                break;
                
            case 13:
                name = "King";
                break;
                
            default:
                //for values above 13 (king) and between 2 and 10 where value name is integer to string
                name = new Integer(value).toString();
                break;
        }
        
        //add " of <suit>" to the end of the name
        name = name.concat(" of " + suit.toString());       
        
        return name;
    }
    
    //accessors and mutators;
    public int getValue() {
        return value;
    }
    
    public void setValue(int cardValue) {
       value = cardValue;
    }
    
    public Suits getSuit (){
        return suit;
    }    
}    
