/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pathOfthejedi.view;

import byui.cit260.pathOfTheJedi.control.ProgramControl;
import byui.cit260.pathOfTheJedi.model.Player;
import java.util.Scanner;

/**
 *
 * @author Technology Handyman
 */
public class StartProgramView {

    
   public StartProgramView() {
       
   }
   
   //program Start Up
    public void startProgram(){

    //Display the banner screen
    this.displayBanner();

    // prompt the player to enter their name
    String playersName = this.getPlayersName();

    // Create and save the player object
    Player player = ProgramControl.createPlayer(playersName);

    // Display a personalized welcome message
    this.displayWelcomeMessage(player);

    // Display the Main menu
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("\n\n=============================================");
        System.out.println("   In a galaxy far far away....");
        System.out.println("\n   Cale’s father Romulus, is a powerful ");
        System.out.println("   diplomat in the new Republic who desires");
        System.out.println("   to eliminate the corruption in the");
        System.out.println("   leadership of the Senate.  However the");
        System.out.println("   Sith presence in the Senate tagged him as");
        System.out.println("   a target after discovering that he was a");
        System.out.println("   Jedi.  Cale and his family lived on New");
        System.out.println("   Tatooine, a farming planet.  As Cale");
        System.out.println("   began to grow his father taught him how");
        System.out.println("   to behave and fight like a Jedi.  He also");
        System.out.println("   trained him in the ways of the force.");
        System.out.println("   One fateful day the Sith led by a Sith");
        System.out.println("   Lord named Syrena Kroan, attacked his");
        System.out.println("   home and took his parents when Cale was");
        System.out.println("   away with his Uncle.  After receiving");
        System.out.println("   training and help from a droid named R4");
        System.out.println("   his father left him, he sought to get");
        System.out.println("   revenge on the Sith who did this to his");
        System.out.println("   family.");
        System.out.println("=============================================\n\n");
        
    }

    private String getPlayersName() {
        boolean valid = false; // idicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){ //while a valid name has not been retrieved
            
            // prompt for the players name
            System.out.println("Enter the player's name below:");
            
            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();      
                    
            //if the name is invalid (less than two char in length)
            if (playersName.length()<2) {
                System.out.println("invalid name - the name must not be blank");
                continue; // and repeat agian
            }
            break; // outof the (exit) the repetition
        }
        
        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=============================================");
    }


}
   
