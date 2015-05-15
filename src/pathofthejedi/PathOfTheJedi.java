/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathofthejedi;

import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.Items;
import byui.cit260.pathOfTheJedi.model.Location;
import byui.cit260.pathOfTheJedi.model.Map;
import byui.cit260.pathOfTheJedi.model.Player;

/**
 *
 * @author Kika
 */
public class PathOfTheJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Chris Elder");
        playerOne.setForceLevel(1.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Actor actorOne = new Actor();
        
        actorOne.setName("Yoda");
        actorOne.setDescription("Jedi master who trained Count Dooku and Luke Skywalker.");
        actorOne.setHome("Unknown");
        actorOne.setType(1);
        actorOne.setForceLevel(10);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        Items itemsOne = new Items();
        
        itemsOne.setDescription("Lightsaber");
        itemsOne.setColor("blue");
        
        String itemsInfo = itemsOne.toString();
        System.out.println(itemsInfo);
                
        Game gameOne = new Game();
        
        gameOne.setTotalTime(10.5);
        
        String timer = gameOne.toString();
        System.out.println(timer);
        
        
        Map locationOne = new Map();
        
        locationOne.setCurrentLocation("dock one");
        
        String dock = locationOne.toString();
        System.out.println(dock);
        
        
        Location locationInvintory = new Location();
        
        locationInvintory.setActorAvailable("Bob");
        locationInvintory.setItemAvailable("boots, light sabre, food");
        locationInvintory.setItemRemaining("boots");
        
        String scene = locationInvintory.toString();
        System.out.println(scene);
    }
    
}
