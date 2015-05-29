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
public class InventoryListControl {
    
    public double calcCrystalPower(double diameter, double crystalLv){
    
        if (diameter < 0 || diameter > 10){
        return -1;}
        
        if (crystalLv < 0 || crystalLv > 3){
        return -1;}
        
        double power = (diameter / 2) + (crystalLv * 2);
        return power;
        
        
    }
    
    
}
