/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.model.Player;

/**
 *
 * @author Technology Handyman
 */
public class ShipMenuView extends View {
    
            public ShipMenuView() {                
                super("\n"
                + "\n(II:::::::::<[==============================================="
                + "\n                        Ship Menu"
                + "\n(II:::::::::<[==============================================="
                + "\n T - Train With R4"            
                + "\n W - Workshop"
                + "\n N - Next Planet"
                + "\n E - Exit Ship"
                + "\n(II:::::::::<[===============================================");
            }
   
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered
        
        switch (choice){
            case 'T': case 't': //Goto Train R4 Menu
                this.trainR4Menu();
                break;            
            case 'W': case 'w': //Woekshop Menu
                this.workshop();
                break;
            case 'N': case 'n': //Woekshop Menu
                this.nextPlanet();
                break;
            case 'E': case 'e': //Exit ship goto current Planet
                this.exitShip();
                break;       
        }
        return false;
    }

    private void trainR4Menu() {
            this.console.println("\n\n             ______             ");
            this.console.println("          ,-'//__\\`-.          ");
            this.console.println("        ,'  ____      `.        ");
            this.console.println("       /   / ,-.-.      |       ");
            this.console.println("      (/# /__`-'_| || || )      ");
            this.console.println("      ||# []/()] O || || |      ");
            this.console.println("    __`------------------'__    ");
            this.console.println("   |--| |<=={_______}=|| |--|   ");
            this.console.println("   |  | |-------------|| |  |   ");
            this.console.println("   |  | |={_______}==>|| |  |   ");
            this.console.println("   |  | |   |: _ :|   || |  |   ");
            this.console.println("   > _| |___|:===:|   || |__<   ");
            this.console.println("   :| | __| |: - :|   || | |:   ");
            this.console.println("   :| | ==| |: _ :|   || | |:   ");
            this.console.println("   :| | ==|_|:===:|___||_| |:   ");
            this.console.println("   :| |___|_|:___:|___||_| |:   ");
            this.console.println("   :| |||   ||/_||| ||| -| |:   ");
            this.console.println("   ;I_|||[]_|||_||| ||| -|_I;   ");
            this.console.println("   |_ |__________________| _|   ");
            this.console.println("   | `|||___|____|____/_//' |   ");
            this.console.println("   J : |     |____/     | : L   ");
            this.console.println("  _|_: |      |__|      | :_|_  ");
            this.console.println("-/ _-_.'    -/    |-    `.-_- |-");
            this.console.println("/______|    /______|    /______|");
            this.console.println("\n");
        TrainR4MenuView trainR4 = new TrainR4MenuView();
        trainR4.display();
    }

    private void workshop() {
        WorkShopView myWorkShop = new WorkShopView();
        myWorkShop.display();
    }
    
    private void nextPlanet() {
        this.console.println("travel");
        Player actorOne = new Player();
        this.console.println("\n\nYou currently on " + Player.getHome() );
        
        if ("New Super Star Destroyer".equals(Player.getHome())){
            this.console.println("\n\nYou are at you final destination");
        }else{
              switch (Player.getHome()){
            case "Kashyyk":  
                Player.setHome("Mandalore");
                break;            
            case "Mandalore":  
                Player.setHome("New Tatooine");
                break;
            case "New Tatooine":  
                Player.setHome("Rantine Space Station");
                break;
            case "Rantine Space Station":  
                Player.setHome("New Super Star Destroyer");
                break;
            case "New Super Star Destroyer":  
                break;
        }
        this.console.println("You have traveled to " + Player.getHome());
        }
    }

    private void exitShip() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
