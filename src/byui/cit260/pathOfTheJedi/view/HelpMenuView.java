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
        System.out.println("****How to Play game*******");
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
