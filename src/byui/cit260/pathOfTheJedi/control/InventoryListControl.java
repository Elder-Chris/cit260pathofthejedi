/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import byui.cit260.pathOfTheJedi.exceptions.InventoryListControlException;
import byui.cit260.pathOfTheJedi.model.InventoryList;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class InventoryListControl {
    double diameter = 0;
    double crystalLv = 0;
    double power = 0;
    double max = 0;
    
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
    
    public double findMax() {
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        double max = 0;
        for (ItemsAvailable itemsAvailable : onhnd){
            if(max < itemsAvailable.getPower()){
                max = itemsAvailable.getPower();
            }
        }
        return max;        
    }
       
    public double sumList() {        
        ArrayList<InventoryList> al = new ArrayList<>();
        al.add(new InventoryList("blue", 6));
        al.add(new InventoryList("green", 2));
        al.add(new InventoryList("yellow", 1));
        al.add(new InventoryList("black", 4));
        
        double sum = 0;
        
        for (InventoryList inventoryList : al){
            sum += inventoryList.getQuantity();
        }
        return sum;
    }
    
    public String exportInventory (String fileLocation) throws InventoryListControlException{
        String message = "";
        try (FileWriter expFile =  new FileWriter(fileLocation + ".txt")){
            ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;            
            expFile.write("\n\n                 Detailed Inventory Report                    \r");
            expFile.write("\n\n°(((=((===°°°(((::::::::::::::::::::::::::::::::::::::::::::::\r");
            expFile.write("\nPower Level \tPlanet Aquired \t\tType\r");
            for (ItemsAvailable itemsAvailable : onhnd){
                String type = itemsAvailable.getType();
                String planet = itemsAvailable.getPlanet();
                double power = itemsAvailable.getPower();
                expFile.write("\n" + power + "\t\t" + planet + "\t\t\t" + type + "\r");
            }
               expFile.write("");               
               expFile.flush();
               
               message = ("\n\nFile Exported");
           } catch (IOException ex) {
               throw new InventoryListControlException("Could not create file!");
           }
       return message;
    }
}


