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
 * @author Technology Handyman
 */
public class Workshop implements Serializable{
    
    //Class Instance Variables
    private String lightSaberCrystal;
    private String lightSaberShell;

    public Workshop() {
    }

    @Override
    public String toString() {
        return "Workshop{" + "lightSaberCrystal=" + lightSaberCrystal + ", lightSaberShell=" + lightSaberShell + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.lightSaberCrystal);
        hash = 89 * hash + Objects.hashCode(this.lightSaberShell);
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
        final Workshop other = (Workshop) obj;
        if (!Objects.equals(this.lightSaberCrystal, other.lightSaberCrystal)) {
            return false;
        }
        if (!Objects.equals(this.lightSaberShell, other.lightSaberShell)) {
            return false;
        }
        return true;
    }
    
    
    public String getLightSaberCrystal() {
        return lightSaberCrystal;
    }

    public void setLightSaberCrystal(String lightSaberCrystal) {
        this.lightSaberCrystal = lightSaberCrystal;
    }

    public String getLightSaberShell() {
        return lightSaberShell;
    }

    public void setLightSaberShell(String lightSaberShell) {
        this.lightSaberShell = lightSaberShell;
    }
    
    
    
}
