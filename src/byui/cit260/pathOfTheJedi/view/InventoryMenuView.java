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
public class InventoryMenuView extends View {
    
        public InventoryMenuView(){
    
            super("\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Inventory Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n I - Veiw Inventory"
            + "\n R - Remove From Inventory"
            + "\n C - Calculate Crystal Power"
            + "\n Q - Quit"
            + "\n(II:::::::::<[===============================================");
        }

    public InventoryMenuView(String promptMessage) {
        super(promptMessage);
    }
                     
            

    

            @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered {
        
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
                return false;
        
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
    public void removeFromInveRemoventory(){
        //TODO; create view crystal method
        System.out.println("Remove From Inventory");
    }
  
    private void quit() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void removeFromInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
