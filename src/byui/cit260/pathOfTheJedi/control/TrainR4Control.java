package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.exceptions.TrainR4ControlException;

public class TrainR4Control {
    
    //combat
    public double calcCombat(double combatLv, double diceRoll) throws TrainR4ControlException {
        double combatVar = (combatLv * 2) - diceRoll;
        if (combatLv >= 10) {
        throw new TrainR4ControlException("You are at max level");
        }        
        if (combatLv <= (combatVar/1.5)){
        throw new TrainR4ControlException("You failed");    
        }        
        double newLv = combatLv + 1;        
        return newLv;
    }
    
    //push    
    public double calcPush(double combatLv, double pushLv, double diceRoll) throws TrainR4ControlException {
        double pullForceVar = ((pushLv / 2) * diceRoll) - combatLv;
        if (pushLv >=10) {
        throw new TrainR4ControlException("You are at max level");
        }
        if (pushLv <= pullForceVar) {
            throw new TrainR4ControlException("You failed"); 
        }    
        double newLv = pushLv + 1;        
        return newLv;
    }
    
    //defense
    public double calcDefence(double defenceLv, double combatLv, double diceRoll) throws TrainR4ControlException {
        double defenceVar = ((defenceLv / 2) * diceRoll) - combatLv;
        if (defenceLv >= 10) {
            throw new TrainR4ControlException("You are at max level");
        }        
        if (defenceLv <= (defenceVar)){
            throw new TrainR4ControlException("You failed");    
        }        
        double newLv = defenceLv + 1;        
        return newLv;
    }
    
    //forceAffinity
    public double calcForceAffinity(double forceAffinityLv, double combatLv, double diceRoll) throws TrainR4ControlException {
        double forceAffinityVar = ((forceAffinityLv / 2) * this.diceRoll()) - combatLv;
        if (forceAffinityLv >= 10) {
            throw new TrainR4ControlException("You are at max level");
        }        
        if (forceAffinityLv <= (forceAffinityVar)){
            throw new TrainR4ControlException("You failed");    
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
