/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import java.util.Scanner;
import byui.cit260.pathOfTheJedi.control.InventoryListControl;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import java.util.ArrayList;

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
            + "\n M - Max Crystal"  
            + "\n S - Sum Crystal"          
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
                case 'M': case 'm': //Exit
                this.maxCrystal();
                break; 
                case 'S': case 's': //Exit
                this.sumCrystal();
                break;     
                case 'Q': case 'q': //Exit
                this.quit();
                break;         
        }
                return false;
        
    }
    public void viewInventory(){
        System.out.println("\n\nList of Inventory Items");
                
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        for (ItemsAvailable itemsAvailable : onhnd){
            String type = itemsAvailable.getType();
            String planet = itemsAvailable.getPlanet();
            double power = itemsAvailable.getPower();
            System.out.println(type + "\t");
        }        
    }
    
    public void removeFromInventory(){
        //TODO; create view crystal method
        System.out.println("\n\nRemove From Inventory");
        
        int i = 1; 
        System.out.println("[ 0 ] - None\t");
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        for (ItemsAvailable itemsAvailable : onhnd){
            String type = itemsAvailable.getType();
            String planet = itemsAvailable.getPlanet();
            double power = itemsAvailable.getPower();
            System.out.println("[ " 
                    + i 
                    + " ] - " 
                    + type + "\t");
            i++;
        }
        System.out.println("What item do you want to remove?");
        Scanner scanner = new Scanner(System.in);
        int rnum = scanner.nextInt();
        if (rnum != 0 ) {
            onhnd.remove(rnum - 1);
            System.out.println("\nItem was removed");
        }
    }
    
    public void calculateCrystalPower(){
        //TODO; create view crystal method
        System.out.println("\n\nRefine Crystal");
        
        int i = 1; 
        System.out.println("[ 0 ] - None\t");
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        for (ItemsAvailable itemsAvailable : onhnd){
            String type = itemsAvailable.getType();
            String planet = itemsAvailable.getPlanet();
            double power = itemsAvailable.getPower();
            if ("Raw_Lightsaber_Crystal".equals(type)){
            System.out.println("[ " 
                    + i 
                    + " ] - " 
                    + type + "\t");
            }
            i++;
        }
        System.out.println("What crystal do you want to refine?");        
        Scanner scanner = new Scanner(System.in);
        int rnum = scanner.nextInt();
        if (rnum != 0 ) {
        double power = ItemsAvailable.OnHand.get(rnum -1).getPower();    
        InventoryListControl control = new InventoryListControl();
        System.out.println("\nEnter the diameter.(0-10)");
        double diameter = scanner.nextDouble();        
        double totalPower = control.calcCrystalPower(diameter, power);
        ItemsAvailable.OnHand.get(rnum -1).setPower(totalPower);
        ItemsAvailable.OnHand.get(rnum -1).setType("Lightsaber_Crystal");
        System.out.println("\n\nThe crystal is now active with a power level of " + totalPower);
        }
    }
    
  
    private void quit() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void maxCrystal() {
        InventoryListControl.findMax();
    }
    
    private void sumCrystal() {
        InventoryListControl.sumList();
    }
}
