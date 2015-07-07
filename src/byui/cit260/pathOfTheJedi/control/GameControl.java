/*

 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.exceptions.GameControlException;
import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.model.Ship;
import byui.cit260.pathOfTheJedi.model.TrainR4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import pathofthejedi.PathOfTheJedi;

public class GameControl {    

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); //write game objet out to file
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        try ( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();
        }
        catch (FileNotFoundException fnfe) {
            throw new GameControlException (fnfe.getMessage());
        }
        catch (Exception e) {
        throw new GameControlException(e.getMessage());
        }
        PathOfTheJedi.setCurrentGame(game);
    }
    
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
   
    public static InventoryList[] getSortedInventoryList(){
            
            InventoryList[] originalInventoryList = 
                PathOfTheJedi.getCurrentGame().getInventory();
            
            InventoryList[] inventoryLista = originalInventoryList.clone();       

            InventoryList tempInventoryList;
            for (int i = 0; i < inventoryLista.length-1; i++){
                for (int j = 0; j < inventoryLista.length-1-i; j++){ 
                    if (inventoryLista[j].getType().
                            compareToIgnoreCase(inventoryLista[j + 1].getType()) > 0){
                        tempInventoryList = inventoryLista[j];
                        inventoryLista[j] =  inventoryLista[j+1];
                        inventoryLista[j+1] = tempInventoryList;
                    }
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

        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Kashyyk", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Lightsaber_Shell", "Kashyyk", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Kashyyk", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Kashyyk", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Raw_Lightsaber_Crystal", "Kashyyk", 1.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Kashyyk", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Kashyyk", 0.00));

        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Mandalore", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Lightsaber_Shell", "Mandalore", 0.25));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Mandalore", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Mandalore", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Raw_Lightsaber_Crystal", "Mandalore", 2.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Mandalore", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Mandalore", 0.00));
        
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Tatooine", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Lightsaber_Shell", "New Tatooine", 0.50));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Tatooine", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Tatooine", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Raw_Lightsaber_Crystal", "New Tatooine", 3.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Tatooine", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Tatooine", 0.00));
        
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Rantine Space Station", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Lightsaber_Shell", "Rantine Space Station", 0.75));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Rantine Space Station", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Rantine Space Station", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Raw_Lightsaber_Crystal", "Rantine Space Station", 5.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Rantine Space Station", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "Rantine Space Station", 0.00));
        
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Super Star Destroyer", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Lightsaber_Shell", "New Super Star Destroyer", 1.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Super Star Destroyer", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Super Star Destroyer", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Raw_Lightsaber_Crystal", "New Super Star Destroyer", 8.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Super Star Destroyer", 0.00));
        ItemsAvailable.ItemsAvail.add(new ItemsAvailable("Force Holograms", "New Super Star Destroyer", 0.00));
        
        Ship ship = new Ship();
        game.setShip(ship);        
             
        TrainR4.setLightSaberScore(0.00);
        TrainR4.setCombat(1.00);
        TrainR4.setPush(1.00);
        TrainR4.setDefence(1.00);
        TrainR4.setForceAffinity(1.00);        

       double updateForceLevel = TrainR4.getLightSaberScore()
               + TrainR4.getCombat()
               + TrainR4.getPush()
               + TrainR4.getDefence()
               + TrainR4.getForceAffinity();           
        
        Player.setForceLevel(updateForceLevel); 
    }
    
}
