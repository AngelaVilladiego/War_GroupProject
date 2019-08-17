/*
 * Class with main method that starts the game and initiates the play method 
 * after user has chosen to play either single or multiplayer
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Angela
 */
public class PlayWar {
    //data members
    private static WarGame wargame;
    
    public static void main (String[] args) {
        //Select game type
        
        //declare variables
        boolean validEntry;
        Scanner in = new Scanner (System.in);
        String entry;
        
        System.out.println("Who would you like to play against?");
        
        do {
            System.out.println("Enter 'human' to play against a friend, or 'computer' to play against me!");
            
            //get user input
            entry = in.nextLine();
            
            //check if either human, computer, or neither
            if (entry.equalsIgnoreCase("human")) {
                //entry is valid
                validEntry = true;
                
                //start a multiplayer game
                wargame = new WarGameMulti();
            } else if (entry.equalsIgnoreCase("computer")) {
                //entry is valid
                validEntry = true;
                
                //start a singleplayer game
                wargame = new WarGameSingle();
            } else {
                //invalid entry
                validEntry = false;
                
                //re-prompt user
                System.out.println("Invalid entry!");
            }
        } while (!validEntry);
        
        //start setup method in proper game type
        wargame.play();
    }        
}
