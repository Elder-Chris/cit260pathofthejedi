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
    /**
     *
     */
    
    public abstract class View implements ViewInterface{  

        private String promptMessage;
        

        public View(String promptMessage) {
            this.promptMessage = promptMessage;
        }

        public String getPromptMessage() {
            return promptMessage;
        }

        public void setPromptMessage(String promptMessage) {
            this.promptMessage = promptMessage;
        }
    
        
        @Override
        public void display() {
            String value = "";
            boolean done = false;
        
        do {
            System.out.println(this.promptMessage); // display the prompt message
            value = this.getInput(); // get value end user enter
            done = this.doAction(value); // do action base on value enter
        } while (!done); //  
    }
        @Override
        public String getInput() {
        boolean valid = false; // idicates if the name has been retrieved
        String value = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){ 
            
            // get the value entered from the keyboard 
            value = keyboard.nextLine();
            value = value.trim();            
        
            //if the value is invalid (less than one char in length)
            if (value.length()<1) {
                System.out.println("valid value has not been entered");
                continue; // and repeat agian
            }
            break; // outof the (exit) the repetition
        }
        return value; // return the value
    }
    }