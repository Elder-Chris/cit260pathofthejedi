/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathofthejedi;

import byui.cit260.pathOfTheJedi.model.Game;
import byui.cit260.pathOfTheJedi.model.Player;
import byui.cit260.pathOfTheJedi.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Kika
 */
public class PathOfTheJedi {
    
    private static Game currentGame = null;
    private static Player player = null; 
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PathOfTheJedi.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PathOfTheJedi.player = player;
    }   

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PathOfTheJedi.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PathOfTheJedi.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PathOfTheJedi.logFile = logFile;
    }   
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      

        try {
            
         PathOfTheJedi.inFile =
                 new BufferedReader(new InputStreamReader(System.in));
         PathOfTheJedi.outFile = new PrintWriter(System.out, true);
         
         //open log file
         String filePath = "log.txt"; //add windows or mac folder structure here.
         PathOfTheJedi.logFile = new PrintWriter(filePath);         
         
         // create StartprogramView and start program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        return;
        
        } catch (Throwable e){
            //System.out.println(te.getMessage());
            System.out.println("Exception: " + e.toString() + 
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            e.printStackTrace();
            //startProgramView.startProgram()            
        }
        finally{
            try{
                if(PathOfTheJedi.inFile != null)
                   PathOfTheJedi.inFile.close();

                if(PathOfTheJedi.outFile != null)
                   PathOfTheJedi.outFile.close();

                if(PathOfTheJedi.logFile != null)
                   PathOfTheJedi.logFile.close();
            }
            catch (IOException ex){
                System.out.println("Error closing files.");
                return;
            }                  
        }
    }   
}
