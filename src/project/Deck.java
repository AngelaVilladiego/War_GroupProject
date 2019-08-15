/*
 * A deck object to define a full deck of a standard 52-card deck
 * in this case to be used in a game of War
 * The size of the deck is stored as a final to allow flexibility in other applications that may need a different sized deck
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author Angela
 */
public class Deck extends GroupOfCards{
    //data members
    private ArrayList<Card> deck = new ArrayList<>();
    private int size;
    private final Suits[] SUITS = {Suits.DIAMONDS, Suits.CLUBS, Suits.HEARTS, Suits.SPADES};    
    
    //Constructor creates a deck in sorted, unshuffled order
    public Deck(int nSize) {
        size = nSize;
        //outer loop defines the value of the card
        for (int i = 1; i <= (size/SUITS.length); i++){
            //inner loop defines the suit of the card
            for (int n = 0; n < SUITS.length; n++){
                Card card = new Card(i, SUITS[n]);
                deck.add(card);
            }
        }
    }
    
    //no arg constructor will create a standard deck size of 52
    public Deck() {
        this(52);
    }
    
    //returns a random card from available cards in the deck
    public Card pickCard(){
        Card card = null;
        
        try {
            //generate a random number between the starting index and end index of the deck arraylist
            int i = (int)(Math.random() * deck.size());
            
            //set card object to the card object at that index in deck arraylist
            card = deck.get(i);
            
            //remove that card from the deck
            deck.remove(i);
        }
        catch (Exception e) {
            //catch exceptions such as if deck is empty
            System.out.println(e);
        }
        
        return card;
    }
    
    //get number of cards left in deck
    public int cardsLeft() {
        return deck.size();
    }

}
