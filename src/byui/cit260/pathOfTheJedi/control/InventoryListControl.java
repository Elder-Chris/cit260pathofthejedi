/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.model.InventoryList;
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
    public double calcCrystalPower(double diameter, double crystalLv){
        this.diameter = diameter;
        this.crystalLv = crystalLv;
        
    
        if (diameter < 0 || diameter > 10){
        return -1;}
        
        if (crystalLv < 0 || crystalLv > 3){
        return -1;}
        
        power = (diameter / 2) + (crystalLv * 2);
        return power;
        
        
    }
    
    public static void findMax() {
        ArrayList<InventoryList> al = new ArrayList<>();
        al.add(new InventoryList("blue", 4));
        al.add(new InventoryList("green", 3));
        al.add(new InventoryList("yellow", 1));
        al.add(new InventoryList("black", 2));
        
        double max = 0;
        
        for (InventoryList inventoryList : al){
            if(max < inventoryList.getQuantity()){
                max = inventoryList.getQuantity();
            }
        }
        }
    
    public static void sumList() {
        
        ArrayList<InventoryList> al = new ArrayList<>();
        al.add(new InventoryList("blue", 5));
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


