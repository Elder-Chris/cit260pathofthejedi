/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.Player;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author Technology Handyman
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if(name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Actor actorOne = new Actor();
        actorOne.setName(name);
        
        PathOfTheJedi.setPlayer(player); // save the palyer
        
        return player;
        
    }
    
}
