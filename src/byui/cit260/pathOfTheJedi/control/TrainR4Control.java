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
    
    public double calcPush(double combatLv, double pushLv, double diceRoll) {
        double pullForceVar = ((pushLv / 2) * diceRoll) - combatLv;
        if (pushLv >=10) {
            return -1;
        }
        if (pushLv <= pullForceVar) {
            return -1;
        }    
        double newLv = pushLv + 1;        
        return newLv;
    }
    
    //defense
    public double calcDefence(double defenceLv, double combatLv, double diceRoll) {
        double defenceVar = ((defenceLv / 2) * diceRoll) - combatLv;
        if (defenceLv >= 10) {
            return -1;
        }
        
        if (defenceLv <= (defenceVar)){
            return -1;    
        }
        
        double newLv = defenceLv + 1;        
        return newLv;
    }
    
    //forceAffinity
    public double calcForceAffinity(double forceAffinityLv, double combatLv, double diceRoll) {
        double forceAffinityVar = ((forceAffinityLv / 2) * diceRoll) - combatLv;
        if (forceAffinityLv >= 10) {
            return -1;
        }
        
        if (forceAffinityLv <= (forceAffinityVar)){
            return -1;    
        }
        
        double newLv = forceAffinityLv + 1;        
        return newLv;
    }
    
    //diceroll
    public double diceRoll(){
        double diceRoll= (int)(Math.random()*6) + 1;
        return diceRoll;
    }

}
