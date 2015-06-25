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
    
    person1("tall"),
    person2("short"),
    person3("fat");
    
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
