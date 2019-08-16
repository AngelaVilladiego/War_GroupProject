/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Angela
 */
public class WarGameSingle extends WarGame {
    
    public WarGameSingle(WarPlayer p1, WarPlayer p2) {
        super(p1, p2);
    }
    
    public WarGameSingle(){}
    
    @Override
    public void setup() {
        System.out.println("\nYou have chosen to play against me, Machina!\n");
        //couldn't think of a better name
        
        //get player's name
        //declare variables
        Scanner in = new Scanner(System.in);
        String name;
        
        System.out.println("Please enter your name!");
        name = in.nextLine();
        
        //create player objects for user and computer
        player1 = new WarPlayer(name);
        player2 = new WarPlayer("Machina");
              
        //initialize deck
        deck = new Deck();
        
        //initialize player scores to half the deck size
        player1.setScore(deck.getSize() / 2);
        player2.setScore(deck.getSize() / 2);
        
        System.out.println("\nOkay, " + name + ". The hands have been dealt! Press enter when you're ready to start the game.");
        
        //get enter to exit method
        in.nextLine();
    }
    
    @Override
    public void play() {    
        //variables
        Scanner in = new Scanner(System.in);
        
        //start with setup
        setup();
        
        System.out.println("__________________________\n");
        System.out.println("Game Start!\n");
        
        //repeat match outline until each player is on last card (2 cards left)
        do {
            showScorecard();
            
            System.out.println("Press enter to flip your card!");
            in.nextLine();
            
            //give user and computer their cards
            player1.setCard(deck.pickCard());
            player2.setCard(deck.pickCard());
            
            //display user's card then computer's card
            System.out.println(player1.getName() + " flipped a " + player1.getCard().toString() + "!");
            System.out.println(player2.getName() + " flipped a " + player2.getCard().toString() + "!");
            
            //compare cards
            int result = player1.getCard().compareTo(player2.getCard());
            
            //check output
            if (result == 0) {
                //if cards have same value, start a WarMatch
                warMatch();
            } else if (result < 0) {
                //<0 means player1's card was lower
                declareMatchWinner(player2);
            } else {
                //last option is >0, where player1's card was higher
                declareMatchWinner(player1);
            }
            
            break;
        } while (deck.cardsLeft() > 2);
    }
    
    @Override
    public void declareWinner(Player winner) {
        
    }
}
