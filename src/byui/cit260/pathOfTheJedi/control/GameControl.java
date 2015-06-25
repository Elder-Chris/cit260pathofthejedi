/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.Items;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.model.Ship;
import byui.cit260.pathOfTheJedi.model.TrainR4;

/**
 *
 * @author Technology Handyman
 */
public class GameControl {

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        pathOfTheJedi.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Items[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        //Map map = MapControl.creatMap();
        //game.setMap(map);
        
        //MapControl.moveActorsToStartLocation(map);
        
        
            public static Items[] createInventoryList(){
            Items[] inventory =
                    new Items[14];
            
            Items hologram = new Items();
            hologram.setDescription("Force Hologram");
            hologram.setColor("none");
            inventory[Items.hologram.ordinal()] = hologram;
            
            return inventory;
        } 
        public static Items[] getSortedInventoryList(){
            
            Items[] originalInventoryList + 
                pathOfTheJedi.getCurrentGame().getInventory();
            
            Items[] inventoryList = originalInventoryList.clone();
            
            Items tempItem;
                For (int i = 0; i < inventoryList.length-1; i++) {
                For (int j = 0; j < inventoryList.length-1-i; j++){ 
                If (inventoryList[j].getDescription().
                compareToIgnoreCase(inventoryList [j + 1].getDescription()) > 0) {
                tempItem = inventoryList[j];
                inventoryList[j] =  inventoryList[j+1];
                inventoryList[j+1] = tempItem;
                }
                }
                }
                return inventoryList;
        }
        
        
        
        TrainR4 trainR4 = new TrainR4();        
        trainR4.setLightSaberScore(0.00);
        trainR4.setCombat(1.00);
        trainR4.setPush(1.00);
        trainR4.setDefence(1.00);
        trainR4.setForceAffinity(1.00);
        
        InventoryList items1 = new InventoryList();
        items1.setType("Force Holograms");
        items1.setQuantity(10);
        
       double updateForceLevel = trainR4.getLightSaberScore()
               + trainR4.getCombat()
               + trainR4.getPush()
               + trainR4.getDefence()
               + trainR4.getForceAffinity();
                
        Actor actorOne = new Actor();
        actorOne.setHome("Kashyyk");
        actorOne.setForceLevel(updateForceLevel);
        
        //intro text
        System.out.println("\n\nYou have just arrived on Kashyyk");
        System.out.println("Your current force level is " + actorOne.getForceLevel());
        System.out.println("What you you like to do?");
        System.out.println("\n");
        
        
        
    }
    
}
