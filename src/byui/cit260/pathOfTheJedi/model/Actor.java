/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;
import java.util.Objects;

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
    //private final static String home;
    private final Double type;
    //private final static double forceLevel;
    //private final Point coordinates;

    Actor(String description) {
        this.description = description;
       type = 2.00;
        
    }
        
        
        //coordinates = new Point(1,1);
    
    
    

    public String getDescription() {
        return description;
    }

    

    //public String getHome() {
    //    return home;
    //}

   

    //public double getType() {
    //    return type;
    //}

   

    //public double getForceLevel() {
     //   return forceLevel;
    //}

    

    

    

    
    
    
}
