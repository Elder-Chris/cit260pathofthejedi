/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import java.util.Scanner;
import byui.cit260.pathOfTheJedi.control.InventoryListControl;

/**
 *
 * @author Kika
 */
public class InventoryMenuView {
    private final String MENU = "\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Inventory Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n I - Veiw Inventory"
            + "\n R - Remove From Inventory"
            + "\n C - Calculate Crystal Power"
            + "\n Q - Quit"
            + "\n(II:::::::::<[===============================================";            
                     
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first char of string
            
            this.doAction(selection); // do action based on selection
        } while (selection != 'Q'); // an selection is not "Exit"
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
            case 'I': case 'i': //View Inventory
                this.viewInventory();
                break;
            case 'R': case 'r': //Remove From Inventory
                this.removeFromInventory();
                break;
            case 'C': case 'c': //Exit
                this.calculateCrystalPower();
                break;       
            case 'Q': case 'q': //Exit
                this.quit();
                break;         
        }
        
    }
    public void viewInventory(){
        //TODO; create view crystals method
        System.out.println("View Inventory");
    }
    public void calculateCrystalPower(){
        //TODO; create view crystal method
        InventoryListControl control = new InventoryListControl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the diameter.(0-10)");
        double diameter = scanner.nextDouble();
        System.out.println("Enter the crystal level.(0-3)");
        double crystalLv = scanner.nextDouble();
        double totalPower = control.calcCrystalPower(diameter, crystalLv);
        System.out.println("The power level of this crystal is " + totalPower);
    }
    public void removeFromInventory(){
        //TODO; create view crystal method
        System.out.println("Remove From Inventory");
    }
  
    private void quit() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
}
