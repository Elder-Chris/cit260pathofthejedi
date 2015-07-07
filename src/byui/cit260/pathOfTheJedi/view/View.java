/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author Kika
 */ 
    /**
     *
     */
    
    public abstract class View implements ViewInterface{  

        private String promptMessage;
        
        protected final BufferedReader keyboard = PathOfTheJedi.getInFile();
        protected final PrintWriter console = PathOfTheJedi.getOutFile();

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
            this.console.println(this.promptMessage); // display the prompt message
            value = this.getInput(); // get value end user enter
            done = this.doAction(value); // do action base on value enter
        } while (!done); //  
    }
        @Override
        public String getInput() {
        boolean valid = false; // idicates if the name has been retrieved
        String value = null;
        
        while(!valid){ 
            
            try {
                // get the value entered from the keyboard
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();            
        
            //if the value is invalid (less than one char in length)
            if (value.length()<1) {
                ErrorView.display(this.getClass().getName(), "You Must enter a Value");
                continue; // and repeat agian
            }
            break; // outof the (exit) the repetition
        }
        return value; // return the value
    }
    }