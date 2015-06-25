/*

 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.TrainR4Control;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.model.TrainR4;
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

    private void combat() {
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();
        TrainR4 trainR4combat = new TrainR4(); 
        double result = instance.calcCombat(trainR4combat.getCombat(), diceRoll);
        if (result < 0 ){
            if (trainR4combat.getCombat()== 10){
            System.out.println("\nYou are at max level");
            }else{
            System.out.println("\nYou Lost");}
        }else{
            trainR4combat.setCombat(result);
            System.out.println("\nYou increased your combat level to " + result);
        }
        double updateForceLevel = trainR4combat.getLightSaberScore()
               + trainR4combat.getCombat()
               + trainR4combat.getPush()
               + trainR4combat.getDefence()
               + trainR4combat.getForceAffinity();
        Player actorOne = new Player();
        actorOne.setForceLevel(updateForceLevel);        
    }

    private void push() {
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();
        TrainR4 trainR4push = new TrainR4(); 
        double result = instance.calcPush(trainR4push.getCombat(), trainR4push.getPush(), diceRoll);
        if (result < 0 ){
            if (trainR4push.getPush()== 10){
            System.out.println("\nYou are at max level");
            }else{
            System.out.println("\nYou Lost");}
        }else{
            trainR4push.setPush(result);
            System.out.println("\nYou increased your push level to " + result);
        }
        double updateForceLevel = trainR4push.getLightSaberScore()
               + trainR4push.getCombat()
               + trainR4push.getPush()
               + trainR4push.getDefence()
               + trainR4push.getForceAffinity();
        Player actorOne = new Player();
        actorOne.setForceLevel(updateForceLevel);
    }

    private void defenceQuestion() {
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();        
        char selection;
        do {            
            System.out.println("\n\nTraning costs 1 Force Hologram you currently have " 
                    + inventory[0].getQuantity() 
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
                if (inventory[0].getQuantity()>0){                
                    TrainR4Control instance = new TrainR4Control();
                    double diceRoll = instance.diceRoll();
                    TrainR4 trainR4defence = new TrainR4(); 
                    double result = instance.calcDefence(trainR4defence.getDefence(), trainR4defence.getCombat(), diceRoll);
                    if (result < 0 ){
                        if (trainR4defence.getDefence()== 10){

                        }else{
                        System.out.println("\nYou Lost");}
                    }else{
                        trainR4defence.setDefence(result);
                        System.out.println("\nYou increased your push level to " + result);
                    }
                    double updateForceLevel = trainR4defence.getLightSaberScore()
                           + trainR4defence.getCombat()
                           + trainR4defence.getPush()
                           + trainR4defence.getDefence()
                           + trainR4defence.getForceAffinity();
                    Player actorOne = new Player();
                    actorOne.setForceLevel(updateForceLevel);
                    inventory[0].setQuantity(inventory[0].getQuantity() - 1.00);
                    System.out.println("You have " + inventory[0].getQuantity() + " Force Holograms left");
                }else{
                    System.out.println("You are out of Force Holograms");
                }
        }
    }
    
    private void affinityQuestion() {
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();        
        char selection = ' ';
        do {            
            System.out.println("\n\nTraning costs 1 Force Hologram you currently have " + inventory[0].getQuantity() 
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
                if (inventory[0].getQuantity()>0){ 
                TrainR4Control instance = new TrainR4Control();
                double diceRoll = instance.diceRoll();
                TrainR4 trainR4forceAffinity = new TrainR4(); 
                double result = instance.calcForceAffinity(trainR4forceAffinity.getForceAffinity(), trainR4forceAffinity.getCombat(), diceRoll);
                if (result < 0 ){
                    if (trainR4forceAffinity.getCombat()== 10){
                    System.out.println("\nYou are at max level");
                    }else{
                    System.out.println("\nYou Lost");}
                }else{
                    trainR4forceAffinity.setForceAffinity(result);
                    System.out.println("\nYou increased your forceAffinity level to " + result);
                }
                double updateForceLevel = trainR4forceAffinity.getLightSaberScore()
                       + trainR4forceAffinity.getCombat()
                       + trainR4forceAffinity.getPush()
                       + trainR4forceAffinity.getDefence()
                       + trainR4forceAffinity.getForceAffinity();
                Player actorOne = new Player();
                actorOne.setForceLevel(updateForceLevel);
                inventory[0].setQuantity(inventory[0].getQuantity() - 1);
                System.out.println("You have " + inventory[0].getQuantity() + " Force Holograms left");
            }else{
                System.out.println("You are out of Force Holograms");
            }
        }
    } 

    private void ship() {        
        // test script needs to be written for save game then main menu
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.display();
    }
}
