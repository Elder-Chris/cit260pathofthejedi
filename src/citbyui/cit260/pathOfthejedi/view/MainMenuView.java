/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pathOfthejedi.view;

import byui.cit260.pathOfTheJedi.control.GameControl;
import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.TrainR4;
import citbyui.cit260.pathOfthejedi.view.GameMenuView;
import java.util.Scanner;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author Technology Handyman
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Main Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n 1 - Load Game"
            + "\n 2 - New Game"
            + "\n 3 - Help"
            + "\n 4 - Options"
            + "\n 5 - Quit"
            + "\n(II:::::::::<[===============================================";            
                     
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first char of string
            
            this.doAction(selection); // do action based on selection
        } while (selection != '5'); // an selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; // idicates if the name has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){ //while a valid name has not been retrieved
            
            // prompt for the players name
            System.out.println("Make Selection:");
            
            // get the name from the keyboard and trim off the blanks
            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();            
        
            
            //if the value is invalid (less than one char in length)
            if (playersInput.length()<1) {
                System.out.println("valid value has not been entered");
                continue; // and repeat agian
            }
            break; // outof the (exit) the repetition
        }
        
        return playersInput; // return the name
    }

    private void doAction(char choice) {
        
        switch (choice){
            case '1': //load a game
                this.loadGame();
                break;
            case '2': //New game
                this.NewGame();
                break;
            case '3': //How to play menu
                this.help();
                break;
            case '4': //options menu  
                this.options();
                break;
            case '5': //Quit the game
                this.quit();
                break;
                    
        }
        
    }

    private void loadGame() {
        System.out.println("****Load an existing game*******");
    }

    private void NewGame() {     
                
        //load the menu
        GameControl.createNewGame(PathOfTheJedi.getPlayer());
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void help() {
        //Display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void options() {
        System.out.println("****Options Menu*******");
    }

    private void quit() {
        System.out.println("****Exiting Game*******");
    }
    
}
