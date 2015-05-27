/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

/**
 *
 * @author David
 */
public class TrainR4Control {
    //combat
    public double calcCombat(double combatLv, double diceRoll) {
        double combatVar = (combatLv * 2) - diceRoll;
        if (combatLv >= 10) {
        return -1;
        }
        
        if (combatLv <= (combatVar/1.5)){
        return -1;    
        }
        
        double newLv = combatLv + 1;
        
        return newLv;
    }
    //push
    
    //defense
    
    //diceroll
    
}
