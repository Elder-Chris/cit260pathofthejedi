/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import java.io.PrintWriter;
import pathofthejedi.PathOfTheJedi;

/**
 *
 * @author David
 */
public class ErrorView {

    private static final PrintWriter errorFile = PathOfTheJedi.getOutFile();
    private static final PrintWriter logFile = PathOfTheJedi.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
        "---------------------------------"
        +"\n- ERROR - " + errorMessage
        +"\n---------------------------------");
        
        //log error
        logFile.println(className + " _ " + errorMessage);
    }
    
}
