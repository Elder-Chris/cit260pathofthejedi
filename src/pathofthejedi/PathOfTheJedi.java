/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathofthejedi;

import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.view.StartProgramView;

/**
 *
 * @author Kika
 */
public class PathOfTheJedi {
    
    private static Game currentGame = null;
    private static Player player = null;  
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PathOfTheJedi.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PathOfTheJedi.player = player;
    }   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        /**
        //Player Class
        Player playerOne = new Player();
        
        playerOne.setName("Chris Elder");
        playerOne.setForceLevel(1.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Actor Class
        Actor actorOne = new Actor();
        
        actorOne.setName("Yoda");
        actorOne.setDescription("Jedi master who trained Count Dooku and Luke Skywalker.");
        actorOne.setHome("Unknown");
        actorOne.setType(1);
        actorOne.setForceLevel(10);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //InventoryList Class
        InventoryList inventoryListOne = new InventoryList();
        inventoryListOne.setType("Cristal");
        inventoryListOne.setAmount(10);
        inventoryListOne.setQuantity(1);
        
        String inventoryListInfo = inventoryListOne.toString();
        System.out.println(inventoryListInfo);
        
        //Item Class
        Items itemsOne = new Items();
        
        itemsOne.setDescription("Lightsaber");
        itemsOne.setColor("blue");
        
        String itemsInfo = itemsOne.toString();
        System.out.println(itemsInfo);
        
        //Game Class
        Game gameOne = new Game();
        
        gameOne.setTotalTime(10.5);
        
        String timer = gameOne.toString();
        System.out.println(timer);
        
        //Map Class
        Map locationOne = new Map();
        
        locationOne.setCurrentLocation("dock one");
        
        String dock = locationOne.toString();
        System.out.println(dock);
        
        //Location Class
        Location locationInvintory = new Location();
        
        locationInvintory.setActorAvailable("Bob");
        locationInvintory.setItemAvailable("boots, light sabre, food");
        locationInvintory.setItemRemaining("boots");
        
        String scene = locationInvintory.toString();
        System.out.println(scene);
        
        //Ship class
        Ship theShip = new Ship();
        
        theShip.setDescription("The ship is long and round oval you could say");
        
        String shipInfo = theShip.toString();
        System.out.println(shipInfo);
        
        //TrainR4
        TrainR4 trainR4 = new TrainR4();
        
        trainR4.setLightSaberUse("Jedi silver saber");
        trainR4.setLightSaberScore(1.00);
        trainR4.setCombat(1.00);
        trainR4.setPush(1.00);
        trainR4.setDefence(1.00);
        trainR4.setForceAffinity(1.00);
        
        String trainInfo = trainR4.toString();
        System.out.println(trainInfo);
        
        //Workshop
        Workshop workshop = new Workshop();
        
        workshop.setLightSaberCrystal("green");
        workshop.setLightSaberShell("silver");
        
        String workshopInfo = workshop.toString();
        System.out.println(workshopInfo);
        */
    }
    
}
