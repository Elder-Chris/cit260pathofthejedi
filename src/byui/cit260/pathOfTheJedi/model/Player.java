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
    private double forceLevel;

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", forceLevel=" + forceLevel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.forceLevel) ^ (Double.doubleToLongBits(this.forceLevel) >>> 32));
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
        if (Double.doubleToLongBits(this.forceLevel) != Double.doubleToLongBits(other.forceLevel)) {
            return false;
        }
        return true;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getForceLevel() {
        return forceLevel;
    }

    public void setForceLevel(double forceLevel) {
        this.forceLevel = forceLevel;
    }
    
    
}
