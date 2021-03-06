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
            stake = 0;
            
            showScorecard();
            
            System.out.println("Press enter to flip your card!");
            in.nextLine();
            
            //give user and computer their cards, up stakes by 2 cards
            player1.setCard(deck.pickCard());
            player2.setCard(deck.pickCard());
            
            stake ++;
            
            //display user's card then computer's card
            System.out.println(player1.getName() + " flipped the " + player1.getCard().toString() + "!");
            System.out.println(player2.getName() + " flipped the " + player2.getCard().toString() + "!");
            
            //compare cards
            int result = player1.getCard().compareTo(player2.getCard());
            
            //check output
            if (result == 0) {
                //if cards have same value, start a WarMatch
                warMatch();
            } else if (result < 0) {
                //<0 means player1's card was lower
                declareMatchWinner(player2);
                
                //give winner points, take away loser's
                player2.setScore(player2.getScore() + stake);
                player1.setScore(player1.getScore() - stake);
                
            } else {
                //last option is >0, where player1's card was higher
                declareMatchWinner(player1);
                
                //give winner points, take away loser's
                player2.setScore(player2.getScore() - stake);
                player1.setScore(player1.getScore() + stake);
            }
            
            System.out.println("\nPress enter to continue.");
            in.nextLine();
        } while ((deck.cardsLeft() / 2) > 1);
        
        //check if no cards left in case last match was a war and finished deck
        if (deck.cardsLeft() != 0) {
            //this is last flip and needs to be handled differently in case of a warMatch
            stake = 0;
            
            showScorecard();
            
            System.out.println("LAST FLIP");
            System.out.println("Press enter to flip your card!");
            in.nextLine();
            
            //give user and computer their cards, up stakes by 2 cards
            player1.setCard(deck.pickCard());
            player2.setCard(deck.pickCard());
            
            stake ++;
            
            //display user's card then computer's card
            System.out.println(player1.getName() + " flipped the " + player1.getCard().toString() + "!");
            System.out.println(player2.getName() + " flipped the " + player2.getCard().toString() + "!");
            
            //compare cards
            int result = player1.getCard().compareTo(player2.getCard());
            
            //check output
            if (result == 0) {
                //if cards have same value, since no cards left, each player gets card back
                
                System.out.println("\nIt's a match, but there's no cards left to declare war! Both player's get their card back.");
            } else if (result < 0) {
                //<0 means player1's card was lower
                declareMatchWinner(player2);
                
                //give winner points, take away loser's
                player2.setScore(player2.getScore() + stake);
                player1.setScore(player1.getScore() - stake);
                
            } else {
                //last option is >0, where player1's card was higher
                declareMatchWinner(player1);
                
                //give winner points, take away loser's
                player2.setScore(player2.getScore() - stake);
                player1.setScore(player1.getScore() + stake);
            }
        }

        System.out.println("Press enter to continue.");
        
        in.nextLine();
        
        //declare the end of the game and the game results
        System.out.println("\nThe game has ended!\n");  
        
        //check winner
        if (player1.getScore() > player2.getScore()) {
            declareWinner(player1, player2);
        } else if (player1.getScore() < player2.getScore()) {
            declareWinner(player2, player1);
        } else {
            declareTie();
        }
    }
    
    @Override
    public void warMatch() {
        Scanner in = new Scanner(System.in);
        
        System.out.println ("\nIt's an even match! War has been declared.");
        System.out.println("Press enter to flip up a card and add 3 more, or whatever's left, to the stakes!");
        
        in.nextLine();
        
        //check that there's enough cards left in deck for drawing four cards each
        //otherwise, use cards left to see max number of cards that can be added to stakes
        int n;
        if (deck.cardsLeft() >= 8) {
            n = 6;
        } else if (deck.cardsLeft() == 2) {
            n = 0;
        } else {
            n = deck.cardsLeft() - 2;
        }

            for (int i = n; i < 0; i++) {
                deck.pickCard();
            }
        

            //give user and computer their cards, up stakes by 8 cards
            player1.setCard(deck.pickCard());
            player2.setCard(deck.pickCard());
            
            stake += ((n + 2) / 2);
            
            //display user's card then computer's card
            System.out.println(player1.getName() + " added " + (n / 2) + " cards to the stakes and flipped the " + player1.getCard().toString() + "!");
            System.out.println(player2.getName() + " added " + (n / 2) + " cards to the stakes and flipped the " + player2.getCard().toString() + "!");
            
            //compare cards
            int result = player1.getCard().compareTo(player2.getCard());
            
            //check output
            if (result == 0) {
                //if cards have same value, start another WarMatch
                warMatch();
            } else if (result < 0) {
                //<0 means player1's card was lower
                declareMatchWinner(player2);
                
                //give winner points, take away loser's
                player2.setScore(player2.getScore() + stake);
                player1.setScore(player1.getScore() - stake);
                
            } else {
                //last option is >0, where player1's card was higher
                declareMatchWinner(player1);
                
                //give winner points, take away loser's
                player2.setScore(player2.getScore() - stake);
                player1.setScore(player1.getScore() + stake);
            }
    }
}
