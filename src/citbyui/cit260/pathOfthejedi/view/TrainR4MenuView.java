/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pathOfthejedi.view;

import byui.cit260.pathOfTheJedi.control.TrainR4Control;
import byui.cit260.pathOfTheJedi.model.Actor;
import byui.cit260.pathOfTheJedi.model.TrainR4;
import java.util.Scanner;

/**
 *
 * @author Technology Handyman
 */
public class TrainR4MenuView {
    private final String MENU = "\n"
            + "\n(II:::::::::<[==============================================="
            + "\n                        Train With R4 Menu"
            + "\n(II:::::::::<[==============================================="
            + "\n 1 - Phisical Combat"            
            + "\n 2 - Force Push"
            + "\n 3 - Defensive Actions"
            + "\n 4 - Force Affinity"
            + "\n Q - Exit Training Room"           
            + "\n(II:::::::::<[==============================================="; 

    void displayMenu() {
        char selection = ' ';
        do {            
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first char of string
            
            this.doAction(selection); // do action based on selection
        } while (selection != '5'); // an selection is not "Exit"
    }
    
    private String getInput() {
        boolean valid = false; // idicates if the name has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){ //while a valid name has not been retrieved
            
            // prompt for the players name
            System.out.println("Make Selection:");
            
            // get the name from the keyboard and trim off the blanks
            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();            
        
            
            //if the value is invalid (less than one char in length)
            if (playersInput.length()<1) {
                System.out.println("a valid value has not been entered");
                continue; // and repeat agian
            }
            break; // out of the (exit) the repetition
        }
        
        return playersInput; // return the name
    }
    
    private void doAction(char choice) {
        
        switch (choice){
            case '1':  //Phisical combat train
                this.combat();
                break;            
            case '2':  //Jedi Force push Train
                this.push();
                break;
            case '3':  //Defence train
                this.defence();
                break;
            case '4':  //Jedi Force affinity train
                this.affinity();
                break;
            case 'Q': case 'q':  //goto ship menu
                this.ship();
                break;
                    
        }
        
    }

    private void combat() {
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();
        TrainR4 trainR4combat = new TrainR4(); 
        double result = instance.calcCombat(trainR4combat.getCombat(), diceRoll);
        if (result < 0 ){
            if (trainR4combat.getCombat()== 10){
            System.out.println("\nYou are at max level");
            }else{
            System.out.println("\nYou Lost");}
        }else{
            trainR4combat.setCombat(result);
            System.out.println("\nYou increased your combat level to " + result);
        }
        double updateForceLevel = trainR4combat.getLightSaberScore()
               + trainR4combat.getCombat()
               + trainR4combat.getPush()
               + trainR4combat.getDefence()
               + trainR4combat.getForceAffinity();
        Actor actorOne = new Actor();
        actorOne.setForceLevel(updateForceLevel);
        
    }

    private void push() {
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();
        TrainR4 trainR4push = new TrainR4(); 
        double result = instance.calcPush(trainR4push.getCombat(), trainR4push.getPush(), diceRoll);
        if (result < 0 ){
            if (trainR4push.getCombat()== 10){
            System.out.println("\nYou are at max level");
            }else{
            System.out.println("\nYou Lost");}
        }else{
            trainR4push.setPush(result);
            System.out.println("\nYou increased your push level to " + result);
        }
        double updateForceLevel = trainR4push.getLightSaberScore()
               + trainR4push.getCombat()
               + trainR4push.getPush()
               + trainR4push.getDefence()
               + trainR4push.getForceAffinity();
        Actor actorOne = new Actor();
        actorOne.setForceLevel(updateForceLevel);
    }

    private void defence() {
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();
        TrainR4 trainR4push = new TrainR4(); 
        double result = instance.calcDefence(trainR4push.getDefence(), trainR4push.getCombat(), diceRoll);
        if (result < 0 ){
            if (trainR4push.getCombat()== 10){
            System.out.println("\nYou are at max level");
            }else{
            System.out.println("\nYou Lost");}
        }else{
            trainR4push.setDefence(result);
            System.out.println("\nYou increased your push level to " + result);
        }
        double updateForceLevel = trainR4push.getLightSaberScore()
               + trainR4push.getCombat()
               + trainR4push.getPush()
               + trainR4push.getDefence()
               + trainR4push.getForceAffinity();
        Actor actorOne = new Actor();
        actorOne.setForceLevel(updateForceLevel);
    }

    private void affinity() {
        TrainR4Control instance = new TrainR4Control();
        double diceRoll = instance.diceRoll();
        TrainR4 trainR4forceAffinity = new TrainR4(); 
        double result = instance.calcForceAffinity(trainR4forceAffinity.getForceAffinity(), trainR4forceAffinity.getCombat(), diceRoll);
        if (result < 0 ){
            if (trainR4forceAffinity.getCombat()== 10){
            System.out.println("\nYou are at max level");
            }else{
            System.out.println("\nYou Lost");}
        }else{
            trainR4forceAffinity.setForceAffinity(result);
            System.out.println("\nYou increased your forceAffinity level to " + result);
        }
        double updateForceLevel = trainR4forceAffinity.getLightSaberScore()
               + trainR4forceAffinity.getCombat()
               + trainR4forceAffinity.getPush()
               + trainR4forceAffinity.getDefence()
               + trainR4forceAffinity.getForceAffinity();
        Actor actorOne = new Actor();
        actorOne.setForceLevel(updateForceLevel);
    } 

    private void ship() {
        
        // test script needs to be written for save game then main menu
        ShipMenuView shipMenu = new ShipMenuView();
        shipMenu.displayMenu();
    }
}
