/*

 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.InventoryList;
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
            InventoryList[] inventory =
                    new InventoryList[4];
            
            InventoryList Force_Hologram = new InventoryList();
            //hologram.setDescription("Force Hologram");
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
            //hologram.setDescription("Force Hologram");
            Trash.setType("Trash");
            Trash.setQuantity(0.00);
            inventory[Item.Trash.ordinal()] = Trash;
            
            return inventory;
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
        
        InventoryList[] inventoryLista = GameControl.createInventoryList();
        game.setInventory(inventoryLista);
        
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
