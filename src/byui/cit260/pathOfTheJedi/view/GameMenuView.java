/*

 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.Player;
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
        System.out.println("and found ");
    }

    private void findSomeone() {
        System.out.println("find someone");
    }
    
    private void viewStatus() {
        Player actorOne = new Player();
        //InventoryList items1 = new InventoryList();
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();
 
        System.out.println("\n\nYou currently on " + actorOne.getHome() );
        System.out.println("Your current force level is " + actorOne.getForceLevel());
        System.out.println("You have " + inventory[0].getQuantity() + " Force Holograms");
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
