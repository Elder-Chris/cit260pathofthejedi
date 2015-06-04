/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pathOfthejedi.view;

import java.util.Scanner;

/**
 *
 * @author Technology Handyman
 */
public class GameMenuView {
    
    private final String MENU = "\n"
            + "\n-----------------------------"
            + "\n Game Menu"
            + "\n-----------------------------"
            + "\n E - Explore"
            + "\n F - Find Someone"
            + "\n V - View Inventory"            
            + "\n S - Go to Ship"
            + "\n Q - Exit and Save"
            + "\n-----------------------------"; 

    void displayMenu() {
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
            case 'e': //load a game
                this.explore();
                break;
            case 'E': //load a game
                this.explore();
                break;
            case 'F': //load a game
                this.findSomeone();
                break;
            case 'V': //load a game
                this.viewInventory();
                break;
            case 'S': //load a game
                this.ship();
                break;
            case 'Q': //load a game
                this.mainMenu();
                break;
                    
        }
        
    }

    private void explore() {
        System.out.println("explore");
    }

    private void findSomeone() {
        System.out.println("find someone");
    }

    private void viewInventory() {
        System.out.println("view inventory");
    }

    private void ship() {
        System.out.println("ship");
    } 

    private void mainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    
}
