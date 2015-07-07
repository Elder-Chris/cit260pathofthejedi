/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.exceptions.InventoryListControlException;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class InventoryListControl {
    double diameter = 0;
    double crystalLv = 0;
    double power = 0;
    
    public InventoryListControl(){}
    public double calcCrystalPower(double diameter, double crystalLv) throws InventoryListControlException{
        this.diameter = diameter;
        this.crystalLv = crystalLv;
        
    
        if (diameter < 0 || diameter > 10){
            throw new InventoryListControlException("Learn to measure, there are"
                    + "no crystals of that size.");
        }
        
        //if (crystalLv < 0 || crystalLv > 3){
           // throw new InventoryListControlException("Fool, there are no crystals of that power.");
        //
        
        power = (diameter / 2) + (crystalLv * 2);
        return power;
        
        
    }
    
    public static void findMax() {
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        double max = 0;
        for (ItemsAvailable itemsAvailable : onhnd){
            if(max < itemsAvailable.getPower()){
                max = itemsAvailable.getPower();
            }
        }
        System.out.println("Max power is " + max);
    }
    
    public static void sumList() {
        
        ArrayList<InventoryList> al = new ArrayList<>();
        al.add(new InventoryList("blue", 6));
        al.add(new InventoryList("green", 2));
        al.add(new InventoryList("yellow", 1));
        al.add(new InventoryList("black", 4));
        
        double sum = 0;
        
        for (InventoryList inventoryList : al){
            sum += inventoryList.getQuantity();
        }
        System.out.println("Sum is " + sum);
}
}


