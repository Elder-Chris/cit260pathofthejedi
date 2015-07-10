/*

 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.GameControl;
import byui.cit260.pathOfTheJedi.control.TrainR4Control;
import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import byui.cit260.pathOfTheJedi.model.Player;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
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
                + "\n P - Print Status"
                + "\n V - Inventory"
                + "\n G - Go to Ship"
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
            case 'S':
            case 's': //Get staus
                this.viewStatus();
                break;
            case 'P':
            case 'p': //print status
                this.printStatus();
                break;
            case 'V':
            case 'v': //View Inventory
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
        System.out.println("\n\nYou have just explored " + Player.getHome());

        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();

        ArrayList<ItemsAvailable> itemavail = ItemsAvailable.ItemsAvail;
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;

        int i = 0;
        if (diceRoll == 2) {
            onhnd.add(new ItemsAvailable("Trash", Player.getHome(), 0.00));
            System.out.println("and found some Trash.");
        } else if (diceRoll == 4) {
            onhnd.add(new ItemsAvailable("Trash", Player.getHome(), 0.00));
            System.out.println("and found some Trash.");
        } else {
            for (ItemsAvailable itemsAvailable : itemavail) {
                if (itemsAvailable.getPlanet() == Player.getHome()) {
                    String type = itemsAvailable.getType();
                    String planet = itemsAvailable.getPlanet();
                    double power = itemsAvailable.getPower();
                    onhnd.add(new ItemsAvailable(type, planet, power));
                    itemavail.remove(i);
                    System.out.println("and found a " + type);
                    break;
                }
                i++;
            }
            if (i != 0) {
                System.out.println("You will not find any useful items here.");
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
            System.out.println("You see two people, do you want to approch"
                    + "the one on the left or the one on the right? (enter L or R)");
            char rightLeft = keyboard.readLine().trim().toUpperCase().charAt(0);

            if (rightLeft == 'L') {
                switch (Player.getHome()) {
                    case "Kashyyk":
                        System.out.println(Actor.lando.getDescription());
                        break;
                    case "Mandalore":
                        System.out.println(Actor.plagueis.getDescription());
                        break;
                    case "New Tatooine":
                        System.out.println(Actor.bail.getDescription());
                        break;
                    case "Rantine Space Station":
                        System.out.println(Actor.bane.getDescription());
                        break;
                    case "New Super Star Destroyer":
                        System.out.println(Actor.typho.getDescription());
                        break;
                }
            }
            if (rightLeft == 'R') {
                switch (Player.getHome()) {
                    case "Kashyyk":
                        System.out.println(Actor.zannah.getDescription());
                        break;
                    case "Mandalore":
                        System.out.println(Actor.mace.getDescription());
                        break;
                    case "New Tatooine":
                        System.out.println(Actor.sidious.getDescription());
                        break;
                    case "Rantine Space Station":
                        System.out.println(Actor.wedge.getDescription());
                        break;
                    case "New Super Star Destroyer":
                        System.out.println(Actor.lumiya.getDescription());
                        break;
                }
            }
            else{
            System.out.println("Give up on being a Jedi, you dont even know what right and left is.");
            
            }
        } catch (IOException e) {
            System.err.println("Error reading data.");
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
        //System.out.println("You have " + items1.getQuantity() + " Force Holograms");
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

        System.out.println("\n\nEnter the file path for file where the game"
                + "is to be saved");
        String filePath = this.getInput();

        try {

            GameControl.saveGame(PathOfTheJedi.getCurrentGame(), filePath);

        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
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
            this.console.println("Esception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        } finally {
            if (outFile != null) {
                outFile.close();
            }
        }

    }
}
