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
        System.out.println("\n\n****************************");
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
        System.out.println("\n\n============================+++++++++");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("\n\n=====================================");
    }


}
   
