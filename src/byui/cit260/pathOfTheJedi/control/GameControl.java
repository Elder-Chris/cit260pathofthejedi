/*

 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import byui.cit260.pathOfTheJedi.model.OnHand;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.model.Ship;
import byui.cit260.pathOfTheJedi.model.TrainR4;
import pathofthejedi.PathOfTheJedi;

public class GameControl {
    
    public enum Item{
        Force_Hologram,
        Lightsber_Shell,
        Lightsaber_Crystal,
        Trash;
        }
    
    public static InventoryList[] createInventoryList(){
            InventoryList[] inventory = new InventoryList[4];
            
            InventoryList Force_Hologram = new InventoryList();
            Force_Hologram.setType("Force Holograms");
            Force_Hologram.setQuantity(0.00);
            inventory[Item.Force_Hologram.ordinal()] = Force_Hologram;
            
            InventoryList Lightsber_Shell = new InventoryList();
            Lightsber_Shell.setType("Lightsber_shell");
            Lightsber_Shell.setQuantity(0.00);
            inventory[Item.Lightsber_Shell.ordinal()] = Lightsber_Shell;
            
            InventoryList Lightsaber_Crystal = new InventoryList();
            Lightsaber_Crystal.setType("Lightsaber_Crystal");
            Lightsaber_Crystal.setQuantity(0.00);
            inventory[Item.Lightsaber_Crystal.ordinal()] = Lightsaber_Crystal;
            
            InventoryList Trash = new InventoryList();
            Trash.setType("Trash");
            Trash.setQuantity(0.00);
            inventory[Item.Trash.ordinal()] = Trash;
            
            return inventory;
        }
    
    public static ItemsAvailable[] createItemsAvailable(){
            ItemsAvailable[] itemsAvailable = new ItemsAvailable[8];
            
            int i = 0;
            
            for ( i = i ; i < 7; i++){                
                ItemsAvailable Force_Hologram = new ItemsAvailable();
                    Force_Hologram.setType("Force Holograms");
                    Force_Hologram.setPlanet("Kashyyk");
                    Force_Hologram.setPower(0.00);            
                    itemsAvailable[i] = Force_Hologram;
            }
            
            i = i++;
            ItemsAvailable Lightsber_Shell = new ItemsAvailable();
                Lightsber_Shell.setType("Lightsber_Shell");
                Lightsber_Shell.setPlanet("Kashyyk");
                Lightsber_Shell.setPower(0.00);            
                itemsAvailable[i] = Lightsber_Shell;
                
            i = i++;
            ItemsAvailable Lightsaber_Crystal = new ItemsAvailable();
                Lightsaber_Crystal.setType("Raw Lightsber Crystal");
                Lightsaber_Crystal.setPlanet("Kashyyk");
                Lightsaber_Crystal.setPower(0.00);            
                itemsAvailable[i] = Lightsaber_Crystal;          

            
            return itemsAvailable;
        }
    
    public static OnHand[] createOnHand(){
            OnHand[] onHand = new OnHand[5];
            
            return onHand;
    }
    
    public static InventoryList[] getSortedInventoryList(){
            
            InventoryList[] originalInventoryList = 
                PathOfTheJedi.getCurrentGame().getInventory();
            
            InventoryList[] inventoryLista = originalInventoryList.clone();       

            InventoryList tempInventoryList;
            for (int i = 0; i < inventoryLista.length-1; i++){
                for (int j = 0; j < inventoryLista.length-1-i; j++){ 
                    //Not sure how to fix this - Chris
                    //if (inventoryLista[j].getDescription().
                    //        compareToIgnoreCase(inventoryLista[j + 1].getDescription()) > 0){
                    //    tempInventoryList = inventoryLista[j];
                    //    inventoryLista[j] =  inventoryLista[j+1];
                    //    inventoryLista[j+1] = tempInventoryList;
                    //}
                }
            }
            return inventoryLista;
        }

    public static void createNewGame(Player player) {   

        Game game = new Game();
        PathOfTheJedi.setCurrentGame(game);
        
        game.setPlayer(player);
        
        InventoryList[] listA = GameControl.createInventoryList();
        game.setInventory(listA);
        
        ItemsAvailable[] listB = GameControl.createItemsAvailable();
        game.setItemsAvailable(listB);
        
        OnHand[] listC = GameControl.createOnHand();
        game.setOnHand(listC);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        TrainR4 trainR4 = new TrainR4();        
        trainR4.setLightSaberScore(0.00);
        trainR4.setCombat(1.00);
        trainR4.setPush(1.00);
        trainR4.setDefence(1.00);
        trainR4.setForceAffinity(1.00);        

       double updateForceLevel = trainR4.getLightSaberScore()
               + trainR4.getCombat()
               + trainR4.getPush()
               + trainR4.getDefence()
               + trainR4.getForceAffinity();
                
        Player actorOne = new Player();
        actorOne.setHome("Kashyyk");
        actorOne.setForceLevel(updateForceLevel);        
        
        //intro text
        System.out.println("\n\nYou have just arrived on Kashyyk");
        System.out.println("Your current force level is " + actorOne.getForceLevel());
        System.out.println("What you you like to do?");
        System.out.println("\n");
    }
    
}
