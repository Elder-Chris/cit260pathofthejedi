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

    public static int gethome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //class instance variables
    private String name;
    //private double forceLevel;
    private static String home;
    private static double forceLevel;
    private static int sithDefeted;
    

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

    public static int getSithDefeted() {
        return sithDefeted;
    }

    public static void setSithDefeted(int sithDefeted) {
        Player.sithDefeted = sithDefeted;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }



}
