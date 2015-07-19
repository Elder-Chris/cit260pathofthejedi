/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.InventoryListControl;
import byui.cit260.pathOfTheJedi.exceptions.InventoryListControlException;
import byui.cit260.pathOfTheJedi.model.ItemsAvailable;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Kika
 */
public class InventoryMenuView extends View {
    
        public InventoryMenuView(){
    
            super("\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Inventory Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n V - Veiw Inventory"
            + "\n R - Remove From Inventory"
            + "\n C - Calculate Crystal Power"
            + "\n M - Max Power"  
            + "\n S - Sum Crystal"          
            + "\n Q - Quit"
            + "\n(II:::::::::<[===============================================");
        }

    public InventoryMenuView(String promptMessage) {
        super(promptMessage);
    }                 
            

    

            @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered {
        
        switch (choice){
            case 'V': case 'v': 
        {
            try {            
                //View Inventory
                this.viewInventory();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            } catch (InventoryListControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
        }
                break;
            case 'R': case 'r': //Remove From Inventory
                this.removeFromInventory();
                break;
            case 'C': case 'c': //Exit
                this.calculateCrystalPower();
                break;
                case 'M': case 'm': //Exit
                this.maxCrystal();
                break; 
                case 'S': case 's': //Exit
                this.sumCrystal();
                break;     
                case 'Q': case 'q': //Exit
                this.quit();
                break;         
        }
                return false;
        
    }
    public void viewInventory() throws IOException, InventoryListControlException{
        this.console.println("\n\nList of Inventory Items");
                
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        for (ItemsAvailable itemsAvailable : onhnd){
            String type = itemsAvailable.getType();
            String planet = itemsAvailable.getPlanet();
            double power = itemsAvailable.getPower();
            this.console.println(type + "\t");
        } 
        
        this.console.println("\n\nDo you want to Export a more detailed list?");
        this.console.println("[ 0 ] - No\t");
        this.console.println("[ 1 ] - Yes\t");
              
        char exprt = keyboard.readLine().trim().toUpperCase().charAt(0);
        
        
        if (exprt == '1' ){
           this.console.println("\n\nEnter a file name?");
           String fileLocation = this.keyboard.readLine();
           
           try {
               InventoryListControl control = new InventoryListControl();
               String message = control.exportInventory (fileLocation);
               this.console.println(message);
           }catch(InventoryListControlException me){
               ErrorView.display(this.getClass().getName(), me.getMessage());
           }
        }else if (exprt == '0' ){
        }else{
            this.console.println("\n\nInvalid entry?");
        }
    }
    
    public void removeFromInventory(){
            try {
                //TODO; create view crystal method
                this.console.println("\n\nRemove From Inventory");
                
                int i = 1;
                this.console.println("[ 0 ] - None\t");
                ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
                for (ItemsAvailable itemsAvailable : onhnd){
                    String type = itemsAvailable.getType();
                    String planet = itemsAvailable.getPlanet();
                    double power = itemsAvailable.getPower();
                    this.console.println("[ "
                            + i
                            + " ] - "
                            + type + "\t");
                    i++;
                }
                this.console.println("What item do you want to remove?");
                String entry = this.keyboard.readLine().trim();
                int rnum = 0;
                String centry = "";
                for(i = 0; i <= entry.length() -1 ; i++){
                  char ch = entry.charAt(i);
                  if (Character.isDigit(ch)){                
                   centry = centry + ch;
                   rnum = Integer.parseInt(centry);
                  }                  
                }
                 
                if (rnum > 0 ) {
                    onhnd.remove(rnum - 1);
                    this.console.println("\nItem was removed");
                }   
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
    }
    
    public void calculateCrystalPower(){
        //TODO; create view crystal method
        this.console.println("\n\nRefine Crystal");
        
        int i = 1; 
        this.console.println("[ 0 ] - None\t");
        ArrayList<ItemsAvailable> onhnd = ItemsAvailable.OnHand;
        for (ItemsAvailable itemsAvailable : onhnd){
            String type = itemsAvailable.getType();
            String planet = itemsAvailable.getPlanet();
            double power = itemsAvailable.getPower();
            if ("Raw_Lightsaber_Crystal".equals(type)){
            this.console.println("[ " 
                    + i 
                    + " ] - " 
                    + type + "\t");
            }
            i++;
        }
        try{
        this.console.println("What crystal do you want to refine?");        
        int rnum = 0;
        String entry;
            try {
                entry = this.keyboard.readLine().trim();
                String centry = "";
                for(i = 0; i <= entry.length() -1 ; i++){
                  char ch = entry.charAt(i);
                  if (Character.isDigit(ch)){                
                   centry = centry + ch;
                   rnum = Integer.parseInt(centry);
                  }                  
                }
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
                
        if (rnum != 0 ) {
        double power = ItemsAvailable.OnHand.get(rnum -1).getPower();    
        InventoryListControl control = new InventoryListControl();
        this.console.println("\nEnter the diameter.(0-10)");
        double diameter = 0;
            try {
                entry = this.keyboard.readLine().trim();
                String centry = "";
                for(i = 0; i <= entry.length() -1 ; i++){
                  char ch = entry.charAt(i);
                  if (Character.isDigit(ch)){                
                   centry = centry + ch;
                   diameter = Double.parseDouble(centry);
                  }                  
                }
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
        double totalPower = control.calcCrystalPower(diameter, power);
        ItemsAvailable.OnHand.get(rnum -1).setPower(totalPower);
        ItemsAvailable.OnHand.get(rnum -1).setType("Lightsaber_Crystal");
        this.console.println("\n\nThe crystal is now active with a power level of " + totalPower);
        }
        }
        catch(InventoryListControlException me) {
                        ErrorView.display(this.getClass().getName(), me.getMessage());
                    }
        
    }
    
  
    private void quit() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void maxCrystal() {
        InventoryListControl control = new InventoryListControl();
        double max = control.findMax();
        this.console.println("Max power is " + max);
    }
    
    private void sumCrystal() {
        InventoryListControl control = new InventoryListControl();
        double sum = control.findMax();
        this.console.println("Sum is " + sum);
    }
}
