/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.model.TrainR4;

/**
 *
 * @author Technology Handyman
 */
public class GameControl {

    public static void createNewGame(Player player) {
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
