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
public class Player implements Serializable{
    
    //class instance variables
    private String name;
    //private double forceLevel;
    private static String home;
    private static double forceLevel;
    

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getHome() {
        return home;
    }

    public static void setHome(String home) {
        Player.home = home;
    }

    public static double getForceLevel() {
        return forceLevel;
    }

    public static void setForceLevel(double forceLevel) {
        Player.forceLevel = forceLevel;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        return Objects.equals(this.name, other.name);
    }

}
