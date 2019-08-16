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

    Card(int i, project.Suits suits) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
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
     //accessors and mutators;
    
  
    public void compareTo(Card card2) {
        //TODO: add method to compare
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
        name = name.concat(" of " + suits.toString());       
        
        return name;
    }
    
   
}    
