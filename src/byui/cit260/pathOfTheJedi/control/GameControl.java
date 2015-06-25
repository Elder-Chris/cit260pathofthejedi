/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.model.Ship;
import byui.cit260.pathOfTheJedi.model.TrainR4;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author Technology Handyman
 */
public class GameControl {
    
    public enum Item{
        hologram;    
        }
    
    public static InventoryList[] createInventoryList(){
            InventoryList[] inventory =
                    new InventoryList[14];
            
            InventoryList hologram = new InventoryList();
            //hologram.setDescription("Force Hologram");
            hologram.setAmount(10.00);
            inventory[Item.hologram.ordinal()] = hologram;
            
            return inventory;
        }
    
    public static InventoryList[] getSortedInventoryList(){
            
            InventoryList[] originalInventoryList = 
                PathOfTheJedi.getCurrentGame().getInventory();
            
            InventoryList[] inventoryLista = originalInventoryList.clone();       

            InventoryList tempInventoryList;
            For (int i = 0; i < inventoryList.length-1; i++){
                For (int j = 0; j < inventoryList.length-1-i; j++){ 
                    if (inventoryLista[j].getAmount().compareToIgnoreCase(inventoryLista[j + 1].getAmount()) > 0) {
                        tempInventoryList = inventoryLista[j];
                        inventoryLista[j] =  inventoryLista[j+1];
                        inventoryLista[j+1] = tempInventoryItem;
                    }
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
        
        InventoryList items1 = new InventoryList();
        items1.setType("Force Holograms");
        items1.setQuantity(10);
        
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
        //System.out.println("Your current force level is " + actorOne.getForceLevel());
        System.out.println("What you you like to do?");
        System.out.println("\n");
    }
    
}
