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
public class Actor implements Serializable{
    
    // class instance variables
    private String name;
    private String description;
    private String home;
    private double type;
    private double forceLevel;

    public Actor() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    public double getForceLevel() {
        return forceLevel;
    }

    public void setForceLevel(double forceLevel) {
        this.forceLevel = forceLevel;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", home=" + home + ", type=" + type + ", forceLevel=" + forceLevel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.home);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.type) ^ (Double.doubleToLongBits(this.type) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.forceLevel) ^ (Double.doubleToLongBits(this.forceLevel) >>> 32));
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.home, other.home)) {
            return false;
        }
        if (Double.doubleToLongBits(this.type) != Double.doubleToLongBits(other.type)) {
            return false;
        }
        if (Double.doubleToLongBits(this.forceLevel) != Double.doubleToLongBits(other.forceLevel)) {
            return false;
        }
        return true;
    }
    
    
}
