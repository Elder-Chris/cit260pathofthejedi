/*

 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.GameControl;
import byui.cit260.pathOfTheJedi.control.TrainR4Control;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import byui.cit260.pathOfTheJedi.model.Player;
import java.util.ArrayList;
import pathofthejedi.PathOfTheJedi;

public class GameMenuView extends View {
    
        public GameMenuView() {
    
            super("\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Game Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n E - Explore"
            + "\n F - Find Someone"
            + "\n S - Status"
            + "\n V - Inventory"            
            + "\n G - Go to Ship"
            + "\n Q - Exit and Save"
            + "\n(II:::::::::<[==============================================="); 
        }
        
        public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value: value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get firs character entered
        
        switch (choice){
            case 'E': case 'e': //Explore planet
                this.explore();
                break;            
            case 'F': case 'f': //Find Someone
                this.findSomeone();
                break;
            case 'S': case 's': //Get staus
                this.viewStatus();
                break;
            case 'V': case 'v': //View Inventory
                this.viewInventory();
                break;
            case 'G': case 'g': //Go to ship menu
                this.ship();
                break;
            case 'Q': case 'q': //Save then goto main menu
                this.mainMenu();
                break;
                    
        }
            return false;
    }

    private void explore() {
        Player actorOne = new Player(); //need to call getHome 
        
        System.out.println("\n\nYou have just explored " + actorOne.getHome());
        
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();        
        
        ArrayList<ItemsAvailable> itemavail = ItemsAvailable.ItemsAvail;        
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        
        int i = 0;
        if (diceRoll == 2){ 
            onhnd.add(new ItemsAvailable("Trash", actorOne.getHome(), 0.00));         
            System.out.println("and found some Trash." );    
        }
        else if (diceRoll == 4){ 
            onhnd.add(new ItemsAvailable("Trash", actorOne.getHome(), 0.00));         
            System.out.println("and found some Trash." );    
        }else{
            for (ItemsAvailable itemsAvailable : itemavail){
                if(itemsAvailable.getPlanet() == actorOne.getHome()){
                    String type = itemsAvailable.getType();
                    String planet = itemsAvailable.getPlanet();
                    double power = itemsAvailable.getPower();                    
                    onhnd.add(new ItemsAvailable(type, planet, power)); 
                    itemavail.remove(i);
                    System.out.println("and found a " + type);
                    break;
                }
                i = i++;
            }
            if (i == itemavail.size()){
                System.out.println("Nothing more to explore");
            }
            }
        
        double fh = 0.00;
        for (ItemsAvailable itemsAvailable : onhnd){
            if(itemsAvailable.getType() == "Force Holograms"){
                fh = fh + 1;
            }                
        }
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();
        inventory[GameControl.Item.Force_Hologram.ordinal()].setQuantity(fh);
    }

    private void findSomeone() {
        System.out.println("find someone");
    }
    
    private void viewStatus() {
        Player actorOne = new Player();
        //InventoryList items1 = new InventoryList();
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();
 
        System.out.println("\n\nYou currently on " + Player.getHome() );
        System.out.println("Your current force level is " + Player.getForceLevel());
        System.out.println("You have " 
                + inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity() 
                + " Force Holograms");
        //System.out.println("You have " + items1.getQuantity() + " Force Holograms");
        System.out.println("\n");
    }

    private void viewInventory() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

    private void ship() {
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.display();
    } 

    private void mainMenu() {
        
        // test script needs to be written for save game then main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}
