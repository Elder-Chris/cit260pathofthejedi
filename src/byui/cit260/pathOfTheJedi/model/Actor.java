/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;

/**
 *
 * @author Kika
 */
public enum Actor implements Serializable{
    
    /*public static void findSomeone(int direction){
        
    String goodGuy[] = new String[5];
    goodGuy[0] = "Lando Carlissian";
    goodGuy[1] = "Mace Windu";
    goodGuy[2] = "Bail Organa";
    goodGuy[3] = "Wedge Antilles";
    goodGuy[4] = "Captain Typho";
    
    String badGuy[] = new String[5];
    badGuy[0] = "Darth Zannah";
    badGuy[1] = "Darth Plagueis";
    badGuy[2] = "Darth Sidious";
    badGuy[3] = "Darth Bane";
    badGuy[4] = "Darth Lumiya";
    
    String planet = Player.getHome();
    
    
    
    }
    */
    
    //Kashyyk
    lando("Lando Carlissian"),
    zannah("Darth Zannah"),//first sith
    //Mandalore
    mace("Mace Windu"),
    plagueis("Darth Plagueis"),//second sith
    //New Tatooine
    bail("Bail Organa"),
    sidious("Darth Sidious"),//third sith
    //Rantine Space Station
    wedge("Wedge Antilles"),
    bane("Darth Bane"),//fourth sith
    //New Super Star Destroyer
    typho("Captain Typho"),
    lumiya("Darth Lumiya");//final sith


    
    // class instance variables
   
    private final String description;
    //private final Double type;
    //private final Point coordinates;

    Actor(String description) {
        this.description = description;
        //type = 2.00;        
    }

    public String getDescription() {
        return description;
    }
    
}
