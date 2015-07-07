/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import java.util.Scanner;

/**
 *
 * @author Kika
 */

public class HelpMenuView extends View {

    public HelpMenuView() {
    
            super("\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Help Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n 1 - How to Play"
            + "\n 2 - Credits"
            + "\n 3 - Main Menu"
            + "\n(II:::::::::<[===============================================");            
    }

        public boolean doAction(Object obj) {
        
        String value = (String) obj;
        
        value: value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get firs character entered
    
        switch (choice){
            case '1': //How To Play
                this.howToPlay();
                break;
            case '2': //Credits
                this.credits();
                break;
            case '3': //Quit the game
                this.mainMenu();
                break;
        }
        return false;
        
    }

    private void howToPlay() {
        this.console.println("\n\n========================================================");
        this.console.println("\nYou will be taking on the character of Cale Novastar.");
        this.console.println("  As your home is being attacked by the Sith.");
        System.out.println("  You will go through different scenarios where you");
        System.out.println("  can collect lightsaber items, force holograms, and allies.");
        System.out.println("  You will train on the Mandalorian ship where ");
        System.out.println("  you will increase your force.");
        System.out.println("  You can select on the Main Menu the New Game option");
        System.out.println("  and you can visit the scenarios we have on it.");
        System.out.println("  These are the different locations that you can ");
        System.out.println("  travel to: Kashyyyk, Mandalore, New Tatooine, Rantine ");
        System.out.println("  Space Station and the New Super Star Destroyer.");
        System.out.println("  You will be able to find Allies on your way to find your revange.");
    }

    private void credits() {
        System.out.println("\n\nThis game was created at ");
        System.out.println("BYU Idaho in the CIT260 class.");
        System.out.println("By Chris Elder, David and Erica");
        System.out.println("May the force be with you. ");
    }

    private void mainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}
