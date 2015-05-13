/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathofthejedi;

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
    }
    
}
