/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathofthejedi;

import byui.cit260.pathOfTheJedi.model.Game;
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
