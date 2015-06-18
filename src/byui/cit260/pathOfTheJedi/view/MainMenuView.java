/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.GameControl;
import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.TrainR4;
import byui.cit260.pathOfTheJedi.view.GameMenuView;
import byui.cit260.pathOfTheJedi.view.View;
import java.util.Scanner;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author Technology Handyman
 */
public class MainMenuView extends View {
    
            public MainMenuView() {
                
            super("\n" 
            + "\n(II:::::::::<[==============================================="
            + "\n                        Main Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n 1 - Load Game"
            + "\n 2 - New Game"
            + "\n 3 - Help"
            + "\n 4 - Options"
            + "\n 5 - Quit"
            + "\n(II:::::::::<[===============================================");            
            }
            
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered
        
        switch (choice){
            case '1': //load a game
                this.loadGame();
                break;
            case '2': //New game
                this.NewGame();
                break;
            case '3': //How to play menu
                this.help();
                break;
            case '4': //options menu  
                this.options();
                break;
            case '5': //Quit the game
                this.quit();
                break;
                    
        }
                return false;
        
    }

    private void loadGame() {
        System.out.println("****Load an existing game*******");
    }

    private void NewGame() {     
                
        //load the menu
        GameControl.createNewGame(PathOfTheJedi.getPlayer());
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void help() {
        //Display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void options() {
        System.out.println("****Options Menu*******");
    }

    private void quit() {
        System.out.println("****Exiting Game*******");
    }
    
}
