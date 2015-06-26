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
