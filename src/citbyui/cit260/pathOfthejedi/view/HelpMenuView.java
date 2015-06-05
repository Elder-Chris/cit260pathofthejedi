/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pathOfthejedi.view;

import java.util.Scanner;

/**
 *
 * @author Kika
 */
public class HelpMenuView {
    
 private final String MENU = "\n"
            + "\n(II:::::::::<[==============================================="
            + "\n Help Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n 1 - How to Play"
            + "\n 2 - Credits"
            + "\n 3 - Quit"
            + "\n(II:::::::::<[===============================================";            
                    

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the help menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first char of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != '3'); // an selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; // idicates if the name has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){ //while a valid number has not been retrieved
            
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
        
        return playersInput; // return the name of the help menu
    }

    private void doAction(char choice) {
        
        switch (choice){
            case '1': //How To Play
                this.howToPlay();
                break;
            case '2': //Credits
                this.credits();
                break;
            case '3': //Quit the game
                this.quit();
                break;
        }
        
    }

    private void howToPlay() {
        System.out.println("****How to Play game*******");
    }

    private void credits() {
        System.out.println("****Credits*******");
    }

    private void quit() {
        System.out.println("****Exiting Game*******");
    }

}
