/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pathOfthejedi.view;

import byui.cit260.pathOfTheJedi.control.GameControl;
import java.util.Scanner;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author David
 */
public class WorkShopView {
    private final String MENU = "\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Work Shop"
            + "\n(II:::::::::<[==============================================="
            + "\n 1 - Veiw Crystals"
            + "\n 2 - Veiw Shell"
            + "\n 3 - Build Light Sabre"
            + "\n 4 - Quit"
            + "\n(II:::::::::<[===============================================";            
                     
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first char of string
            
            this.doAction(selection); // do action based on selection
        } while (selection != '4'); // an selection is not "Exit"
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
                this.viewCrystals();
                break;
            case '2': //New game
                this.viewShell();
                break;
            case '3': //How to play menu
                this.buildLightSabre();
                break;
            
                    
        }
        
    }
    public void viewCrystals(){
        //TODO; create view crystals method
        System.out.println("view crystal stub");
    }
    public void viewShell(){
        //TODO; create view crystal method
        System.out.println("view Shell stub");
    }
    public void buildLightSabre(){
        //TODO; creat build light sabre method
        System.out.println("view build light sabre stub");
    }
}
