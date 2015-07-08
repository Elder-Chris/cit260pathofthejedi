/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.view;

import byui.cit260.pathOfTheJedi.control.ProgramControl;
import byui.cit260.pathOfTheJedi.model.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Technology Handyman
 */
public class StartProgramView extends View {

    public StartProgramView() {

    }

    public boolean doAction(Object o) {
        return true;
    }

    //program Start Up
    public void startProgram() {

        //Display the banner screen
        this.displayBanner();

        // prompt the player to enter their name
        String playersName = this.getPlayersName();

        // Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        // Display a personalized welcome message
        this.displayWelcomeMessage(player);

        // Display the Main menu
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        // Display the Help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayBanner() {
        this.console.println("\n\n       d888888888888888888  d8888b    8888888888b");
        this.console.println("       Y888888888888888888 d88PY88b   88888888888b");
        this.console.println("        Y888b    88888    ,88P  Y88.  888R    X88P");
        this.console.println("         Y888b   88888    d88'  `88b  8888bood88P");
        this.console.println(" 8888888888888b  88888   ,8888888888. 8888PY88888888888");
        this.console.println("  8888888888888P  88888   888P    Y888 8888  Y8888888888");
        this.console.println("    ");
        this.console.println(" Y88b   d88b   d88P  d8888b    8888888888b  d8888888888");
        this.console.println(" `888b d8888b d888' d88PY88b   88888888888b Y8888888888");
        this.console.println("  Y888V888888V888P ,88P  Y88.  888R    X88P  Y888b");
        this.console.println("  `888888PY888888' d88'  `88b  8888bood88P    Y888b");
        this.console.println("   Y8888P  Y8888P ,8888888888. 8888PY8SSt&cgmm88888b");
        this.console.println("    Y88P    Y88P  888P    Y888 8888  Y8888888888888P");

        this.console.println("\n\n========================================================");
        this.console.println("     In a galaxy far far away....");
        this.console.println("\n     Cale’s father Romulus, is a powerful ");
        this.console.println("     diplomat in the new Republic who desires");
        this.console.println("     to eliminate the corruption in the");
        this.console.println("     leadership of the Senate.  However the");
        this.console.println("     Sith presence in the Senate tagged him as");
        this.console.println("     a target after discovering that he was a");
        this.console.println("     Jedi.  Cale and his family lived on New");
        this.console.println("     Tatooine, a farming planet.  As Cale");
        this.console.println("     began to grow his father taught him how");
        this.console.println("     to behave and fight like a Jedi.  He also");
        this.console.println("     trained him in the ways of the force.");
        this.console.println("     One fateful day the Sith led by a Sith");
        this.console.println("     Lord named Syrena Kroan, attacked his");
        this.console.println("     home and took his parents when Cale was");
        this.console.println("     away with his Uncle.  After receiving");
        this.console.println("     training and help from a droid named R4");
        this.console.println("     his father left him, he sought to get");
        this.console.println("     revenge on the Sith who did this to his");
        this.console.println("     family.");
        this.console.println("========================================================\n\n");

    }

    private String getPlayersName() {

        boolean valid = false; // idicates if the name has been retrieved
        String playersName = null;
        //Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) { try {
            //while a valid name has not been retrieved
            
            // prompt for the players name
            this.console.println("Enter the player's name below:");

            // get the name from the keyboard and trim off the blanks
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();

            //if the name is invalid (less than two char in length)
            if (playersName.length() < 2) {
                this.console.println("invalid name - the name must not be blank");
                continue; // and repeat agian
            }
            break; // outof the (exit) the repetition
            } catch (IOException ex) {
                Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n°(((=((===°°°(((:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        this.console.println("\tWelcome to the game " + player.getName());
        this.console.println("\tWe hope you have a lot of fun!");
        this.console.println("°(((=((===°°°(((:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }

}
