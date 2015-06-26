/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

/**
 *
 * @author David
 */
public class WorkShopView extends View {
    
    public WorkShopView(){
    
            super("\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Work Shop"
            + "\n(II:::::::::<[==============================================="
            + "\n 1 - Veiw Crystals"
            + "\n 2 - Veiw Shell"
            + "\n 3 - Build Light Sabre"
            + "\n 4 - Quit"
            + "\n(II:::::::::<[===============================================");            
        }          
            

    

    @Override
        public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered {
        
        switch (choice){
            case '1': //load a game
                this.viewCrystals();
                break;
            case '2': //New game
                this.viewShell();
                break;
            case '3': //How to play menu
                this.buildLightSabre();
                break;
            
                    
        }
        return false;
        
    }
    public void viewCrystals(){
        //TODO; create view crystals method
        System.out.println("view crystal stub");
    }
    public void viewShell(){
        //TODO; create view crystal method
        System.out.println("view Shell stub");
    }
    public void buildLightSabre(){
        //TODO; creat build light sabre method
        System.out.println("view build light sabre stub");
    }
}
