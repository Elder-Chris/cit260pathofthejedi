/*

 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.GameControl;
import byui.cit260.pathOfTheJedi.control.TrainR4Control;
import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import byui.cit260.pathOfTheJedi.model.Player;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                + "\n I - Inventory"
                + "\n G - Go to Ship"                
                + "\n A - Print Actor names"
                + "\n P - Print Status"
                + "\n Q - Exit and Save"
                + "\n(II:::::::::<[===============================================");
    }

    public boolean doAction(Object obj) {

        String value = (String) obj;

        value:
        value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get firs character entered

        switch (choice) {
            case 'E':
            case 'e': //Explore planet
                this.explore();
                break;
            case 'F':
            case 'f': //Find Someone
                this.findSomeone();
                break;
            case 'A':
            case 'a': {
            try {
                //Prin Actor's names
                this.printActorNames();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
        }
                break;        
            case 'S':
            case 's': //Get staus
                this.viewStatus();
                break;
            case 'P':
            case 'p': //print status
                this.printStatus();
                break;
            case 'I':
            case 'i': //View Inventory
                this.viewInventory();
                break;
            case 'G':
            case 'g': //Go to ship menu
                this.ship();
                break;
            case 'Q':
            case 'q': //Save then goto main menu
                this.mainMenu();
                break;

        }
        return false;
    }

    private void explore() {
        this.console.println("\n\nYou have just explored " + Player.getHome());

        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();

        ArrayList<ItemsAvailable> itemavail = ItemsAvailable.ItemsAvail;
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;

        int i = 0;
        if (diceRoll == 2) {
            onhnd.add(new ItemsAvailable("Trash", Player.getHome(), 0.00));
            this.console.println("and found some Trash.");
        } else if (diceRoll == 4) {
            onhnd.add(new ItemsAvailable("Trash", Player.getHome(), 0.00));
            this.console.println("and found some Trash.");
        } else {
            for (ItemsAvailable itemsAvailable : itemavail) {
                if (itemsAvailable.getPlanet() == null ? Player.getHome() == null 
                        : itemsAvailable.getPlanet().equals(Player.getHome())) {
                    String type = itemsAvailable.getType();
                    String planet = itemsAvailable.getPlanet();
                    double power = itemsAvailable.getPower();
                    onhnd.add(new ItemsAvailable(type, planet, power));
                    itemavail.remove(i);
                    this.console.println("and found a " + type);
                    break;
                }
                i++;
            }
            if (i != 0) {
                this.console.println("You will not find any useful items here.");
            }
        }

        double fh = 0.00;
        for (ItemsAvailable itemsAvailable : onhnd) {
            if ("Force Holograms".equals(itemsAvailable.getType())) {
                fh = fh + 1;
            }
        }
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();
        inventory[GameControl.Item.Force_Hologram.ordinal()].setQuantity(fh);
    }

    private void findSomeone() {

        try {
            int maxSithNum = 0;
            switch (Player.getHome()){
                    case "Kashyyk":
                        maxSithNum = 1;
                        break;
                    case "Mandalore":
                        maxSithNum = 2;
                        break;
                    case "New Tatooine":
                        maxSithNum = 3;
                        break;
                    case "Rantine Space Station":
                        maxSithNum = 4;
                        break;
                    case "New Super Star Destroyer":
                        maxSithNum = 5;
                        break;
            }
            if (Player.getSithDefeted() < maxSithNum){                
                this.console.println("Do you want to approch the Sith or the good guy."
                        + "(choose S for sith or G for good guy)");
                char goodBad = keyboard.readLine().trim().toUpperCase().charAt(0);

                if (goodBad == 'G') {
                    switch (Player.getHome()) {
                        case "Kashyyk":
                            this.console.println(Actor.lando.getDescription());
                            break;
                        case "Mandalore":
                            this.console.println(Actor.mace.getDescription());
                            break;
                        case "New Tatooine":
                            this.console.println(Actor.bail.getDescription());
                            break;
                        case "Rantine Space Station":
                            this.console.println(Actor.wedge.getDescription());
                            break;
                        case "New Super Star Destroyer":
                            this.console.println(Actor.typho.getDescription());
                            break;
                    }                
                }else if (goodBad == 'S') {
                    switch (Player.getHome()) {
                        case "Kashyyk":
                            this.console.println(Actor.zannah.getDescription());
                            break;
                        case "Mandalore":
                            this.console.println(Actor.plagueis.getDescription());
                            break;
                        case "New Tatooine":
                            this.console.println(Actor.sidious.getDescription());
                            break;
                        case "Rantine Space Station":
                            this.console.println(Actor.sidious.getDescription());
                            break;
                        case "New Super Star Destroyer":
                            this.console.println(Actor.lumiya.getDescription());
                            break;
                    }

                    this.console.println("\nDo you want to battle this Sith? (Y or N)"); 
                    char battle = keyboard.readLine().trim().toUpperCase().charAt(0);

                    if (battle == 'Y'){
                                               
                        this.console.println("battle code");
                        TrainR4Control instance = new TrainR4Control();
                        double diceRoll = instance.diceRoll();
                        double battlePlayerLv = Player.getForceLevel();
                        double battleSithLv = (maxSithNum * 10) + diceRoll;
                        double tempPlayerLv = battlePlayerLv;
                        double tempSithLv = battleSithLv;
                        
                                                                        
                        for(int i = 0; i<100; i++){
                            if (tempPlayerLv < 0){
                                this.console.println("You lost, train some more and come back to fight another day.");
                                break;
                            }else if (tempSithLv < 0){
                                this.console.println("You have defeted the Sith");
                                Player.setSithDefeted(Player.getSithDefeted() + 1);
                                break;                                
                            }
                            
                            this.console.println("Your Health Level [ " 
                                + Math.round((tempPlayerLv / battlePlayerLv) * 100)  
                                + "% ] --------- Sith Health Level [ " 
                                + Math.round((tempSithLv / battleSithLv) * 100)
                                + "% ] ");
                            this.console.println("\nDo you want attack the Sith? (Y or N)"); 
                            char attack = keyboard.readLine().trim().toUpperCase().charAt(0);
                            
                             if (attack == 'Y'){
                                 diceRoll = instance.diceRoll();
                                 tempPlayerLv = tempPlayerLv - diceRoll;
                                 diceRoll = instance.diceRoll();
                                 tempSithLv = tempSithLv - diceRoll;                                                                  
                             }else{
                                 break;
                             }                            
                        }
                        
                    }

                    }else{
                        this.console.println("Thats not a person.");           

                    }
            }else{
                this.console.println("\n\nGreat job you have defeted the sith on"
                        + " this planet goto your ship and tavel to your next location.");
                }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading data:" + e.getMessage());
        }
        
    }
    
    private void viewStatus() {
        viewStatus(console);
    }

    /**
     * print defined as out, and passed to default view status
     *
     * @param out
     */
    private void viewStatus(PrintWriter out) {
        Player actorOne = new Player();
        //InventoryList items1 = new InventoryList();
        InventoryList[] inventory = PathOfTheJedi.getCurrentGame().getInventory();

        out.println("\n\nYou currently on " + Player.getHome());
        out.println("Your current force level is " + Player.getForceLevel());
        out.println("You have "
                + inventory[GameControl.Item.Force_Hologram.ordinal()].getQuantity()
                + " Force Holograms");
        //this.console.println("You have " + items1.getQuantity() + " Force Holograms");
        out.println("\n");
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

        this.console.println("\n\nEnter the file path for file where the game"
                + "is to be saved");
        String filePath = this.getInput();

        try {

            GameControl.saveGame(PathOfTheJedi.getCurrentGame(), filePath);

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "MainMenuView" + e.getMessage());
        }

        // test script needs to be written for save game then main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void printStatus() {
        PrintWriter outFile = null;
        try {
            String filePath = "status.txt";
            outFile = new PrintWriter(filePath);
            viewStatus(outFile);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        } finally {
            if (outFile != null) {
                outFile.close();
            }
        }

    }

    public void printActorNames() throws IOException {
        FileWriter outFile = null;
        String fileLocation = "actors.txt";
        
        try {
            outFile = new FileWriter(fileLocation);
            
            outFile.write("Lando Carlissian\n");
            outFile.write("Mace Windu\n");
            outFile.write("Bail Organa\n");
            outFile.write("Wedge Antilles\n");
            outFile.write("Captain Typho\n");
            outFile.write("Darth Zannah\n");
            outFile.write("Darth Plagueis\n");
            outFile.write("Darth Sidious\n");
            outFile.write("Darth Bane\n");
            outFile.write("Darth Lumiya\n");

            outFile.flush();
            
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error displaying Actor names: " + ex.toString());
        } finally {
            if (outFile != null) {
                outFile.close();
            }
        }

    }
}