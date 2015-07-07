/*

 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.GameControl;
import byui.cit260.pathOfTheJedi.control.TrainR4Control;
import byui.cit260.pathOfTheJedi.exceptions.TrainR4ControlException;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.model.TrainR4;
import java.util.ArrayList;
import pathofthejedi.PathOfTheJedi;

/**

 */
public class TrainR4MenuView extends View {
    
            public TrainR4MenuView() {                
                super("\n"
                + "\n(II:::::::::<[==============================================="
                + "\n                        Train With R4 Menu"
                + "\n(II:::::::::<[==============================================="
                + "\n 1 - Phisical Combat"            
                + "\n 2 - Force Push"
                + "\n 3 - Defensive Actions"
                + "\n 4 - Force Affinity"
                + "\n Q - Exit Training Room"           
                + "\n(II:::::::::<[==============================================="); 
            }
        
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered
        
        switch (choice){
            case '1':  //Phisical combat train
                this.combat();
                break;            
            case '2':  //Jedi Force push Train
                this.push();
                break;
            case '3':  //Defence train
                this.defenceQuestion();
                break;
            case '4':  //Jedi Force affinity train
                this.affinityQuestion();
                break;
            case 'Q': case 'q':  //goto ship menu
                this.ship();
                break;                    
        }
        return false;
    }

    private void combat(){
        
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();        
        //double result = instance.calcCombat(TrainR4.getCombat(), diceRoll);
        try {
           double result = instance.calcCombat(TrainR4.getCombat(), diceRoll);
           this.console.println("\nYou increased your combat level to " + result);
           TrainR4.setCombat(result);
           double updateForceLevel = TrainR4.getLightSaberScore()
               + TrainR4.getCombat()
               + TrainR4.getPush()
               + TrainR4.getDefence()
               + TrainR4.getForceAffinity();        
            Player.setForceLevel(updateForceLevel);
        } catch (TrainR4ControlException me) {
            ErrorView.display(this.getClass().getName(), me.getMessage());
            //ErrorView.display(this.getClass().getName(), "Error reading input: " + me.getMessage());
        }               
    }

    private void push() {
        
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();       
        try {
           double result = instance.calcPush(TrainR4.getCombat(), TrainR4.getPush(), diceRoll);
           TrainR4.setPush(result);
           this.console.println("\nYou increased your push level to " + result);
           double updateForceLevel = TrainR4.getLightSaberScore()
                   + TrainR4.getCombat()
                   + TrainR4.getPush()
                   + TrainR4.getDefence()
                   + TrainR4.getForceAffinity();
            Player.setForceLevel(updateForceLevel);
        } catch (TrainR4ControlException me) {
            ErrorView.display(this.getClass().getName(), me.getMessage());
        }
    }

    private void defenceQuestion() {
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();        
        char selection;
        do {            
            this.console.println("\n\nTraning costs 1 Force Hologram you currently have " 
                    + inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity() 
                    + ". \nAre you sure you want to continue? \nEnter Y or N"); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first char of string
            
            this.defence(selection);        
            break; // do action based on selection
        } while (selection != 'Q'); // an selection is not "Exit"
    }
        
    private void defence(char choice) {
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();        
        if (choice == 'Y' || choice == 'y'){                         
            if (inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity()>0){                
                    TrainR4Control instance = new TrainR4Control();
                    double diceRoll = instance.diceRoll();
                    
                    try {
                        TrainR4 trainR4defence = new TrainR4(); 
                        double result = instance.calcDefence(TrainR4.getDefence(), TrainR4.getCombat(), diceRoll);                    
                        TrainR4.setDefence(result);
                        this.console.println("\nYou increased your push level to " + result);
                        double updateForceLevel = TrainR4.getLightSaberScore()
                               + TrainR4.getCombat()
                               + TrainR4.getPush()
                               + TrainR4.getDefence()
                               + TrainR4.getForceAffinity();
                        Player.setForceLevel(updateForceLevel);
                        //removes hologram from invent and form quanity
                        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
                        int i = 0;
                        for (ItemsAvailable itemsAvailable : onhnd){
                            if("Force Holograms".equals(itemsAvailable.getType())){
                               onhnd.remove(i);
                               break;
                            }
                        i++;
                        }
                        inventory[GameControl.Item.Force_Hologram.ordinal()].setQuantity(inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity() - 1.00);
                        this.console.println("You have " + inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity() + " Force Holograms left");
                    }catch(TrainR4ControlException me) {
                        ErrorView.display(this.getClass().getName(), me.getMessage());
                    }                  
            }else{
                this.console.println("\n\nYou could not train, you are out of Force Holograms");
            }
        }
    }
    
    
    private void affinityQuestion() {
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();        
        char selection = ' ';
        do {            
            this.console.println("\n\nTraning costs 1 Force Hologram you currently have " 
                    + inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity() 
                    + ". \nAre you sure you want to continue? \nEnter Y or N"); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first char of string
            
            this.affinity(selection);        
            break; // do action based on selection
        } while (selection != 'Q'); // an selection is not "Exit"
    }

    private void affinity(char choice) {
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();        
        if (choice == 'Y' || choice == 'y'){
            if (inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity()>0){ 
                TrainR4Control instance = new TrainR4Control();
                double diceRoll = instance.diceRoll();
                
                try {
                    TrainR4 trainR4forceAffinity = new TrainR4(); 
                    double result = instance.calcForceAffinity(TrainR4.getForceAffinity(), TrainR4.getCombat(), diceRoll);
                        TrainR4.setForceAffinity(result);
                        this.console.println("\nYou increased your Force Affinity level to " + result);

                    double updateForceLevel = TrainR4.getLightSaberScore()
                           + TrainR4.getCombat()
                           + TrainR4.getPush()
                           + TrainR4.getDefence()
                           + TrainR4.getForceAffinity();
                    Player.setForceLevel(updateForceLevel);
                    //removes hologram from inventory and form quanity
                    ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
                    int i = 0;
                    for (ItemsAvailable itemsAvailable : onhnd){
                        if("Force Holograms".equals(itemsAvailable.getType())){
                           onhnd.remove(i);
                           break;
                        }
                    i++;
                    }
                inventory[GameControl.Item.Force_Hologram.ordinal()].setQuantity(inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity() - 1);
                this.console.println("You have " + inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity() + " Force Holograms left");
                }catch(TrainR4ControlException me) {
                        ErrorView.display(this.getClass().getName(), me.getMessage());
                    }
                }
            }else{
                this.console.println("\n\nYou could not train, you are out of Force Holograms");
            }
        }
     

    private void ship() {        
        // test script needs to be written for save game then main menu
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.display();
    }
}
