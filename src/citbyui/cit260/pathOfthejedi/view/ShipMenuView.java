/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pathOfthejedi.view;

import byui.cit260.pathOfTheJedi.model.Actor;
import java.util.Scanner;

/**
 *
 * @author Technology Handyman
 */
public class ShipMenuView {
    private final String MENU = "\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Ship Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n T - Train With R4"            
            + "\n W - Workshop"
            + "\n N - Next Planet"
            + "\n E - Exit Ship"
            + "\n(II:::::::::<[==============================================="; 

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
                System.out.println("a valid value has not been entered");
                continue; // and repeat agian
            }
            break; // out of the (exit) the repetition
        }
        
        return playersInput; // return the name
    }
    
    private void doAction(char choice) {
        
        switch (choice){
            case 'T': case 't': //Goto Train R4 Menu
                this.trainR4Menu();
                break;            
            case 'W': case 'w': //Woekshop Menu
                this.workshop();
                break;
            case 'N': case 'n': //Woekshop Menu
                this.nextPlanet();
                break;
            case 'E': case 'e': //Exit ship goto current Planet
                this.exitShip();
                break;         
                    
        }
        
    }

    private void trainR4Menu() {
                    System.out.println("\n\n             ______             ");
            System.out.println("          ,-'//__\\`-.          ");
            System.out.println("        ,'  ____      `.        ");
            System.out.println("       /   / ,-.-.      |       ");
            System.out.println("      (/# /__`-'_| || || )      ");
            System.out.println("      ||# []/()] O || || |      ");
            System.out.println("    __`------------------'__    ");
            System.out.println("   |--| |<=={_______}=|| |--|   ");
            System.out.println("   |  | |-------------|| |  |   ");
            System.out.println("   |  | |={_______}==>|| |  |   ");
            System.out.println("   |  | |   |: _ :|   || |  |   ");
            System.out.println("   > _| |___|:===:|   || |__<   ");
            System.out.println("   :| | __| |: - :|   || | |:   ");
            System.out.println("   :| | ==| |: _ :|   || | |:   ");
            System.out.println("   :| | ==|_|:===:|___||_| |:   ");
            System.out.println("   :| |___|_|:___:|___||_| |:   ");
            System.out.println("   :| |||   ||/_||| ||| -| |:   ");
            System.out.println("   ;I_|||[]_|||_||| ||| -|_I;   ");
            System.out.println("   |_ |__________________| _|   ");
            System.out.println("   | `|||___|____|____/_//' |   ");
            System.out.println("   J : |     |____/     | : L   ");
            System.out.println("  _|_: |      |__|      | :_|_  ");
            System.out.println("-/ _-_.'    -/    |-    `.-_- |-");
            System.out.println("/______|    /______|    /______|");
            System.out.println("\n");
        TrainR4MenuView trainR4 = new TrainR4MenuView();
        trainR4.displayMenu();
    }

    private void workshop() {
        System.out.println("goto workshop");
    }
    
    private void nextPlanet() {
        System.out.println("travel");
        Actor actorOne = new Actor();
        System.out.println("\n\nYou currently on " + actorOne.getHome() );
        
        switch (actorOne.getHome()){
            case "Kashyyk":  
                actorOne.setHome("Mandalore");
                break;            
            case "Mandalore":  
                actorOne.setHome("New Tatooine");
                break;
            case "New Tatooine":  
                actorOne.setHome("Rantine Space Station");
                break;
            case "Rantine Space Station":  
                actorOne.setHome("New Super Star Destroyer");
                break;
            case "New Super Star Destroyer":  
                break;
        }
        System.out.println("You have traveled to " + actorOne.getHome());
    }

    private void exitShip() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
}
