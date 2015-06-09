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
public class TrainR4 implements Serializable{
    
    //class instance variables
    private static String lightSaberUse;
    private static double lightSaberScore;
    private static double combat;
    private static double push;
    private static double defence;
    private static double forceAffinity;

    public TrainR4() {
    }

    @Override
    public String toString() {
        return "TrainR4{" + "lightSaberUse=" + lightSaberUse + ", lightSaberScore=" + lightSaberScore + ", combat=" + combat + ", push=" + push + ", defence=" + defence + ", forceAffinity=" + forceAffinity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.lightSaberUse);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.lightSaberScore) ^ (Double.doubleToLongBits(this.lightSaberScore) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.combat) ^ (Double.doubleToLongBits(this.combat) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.push) ^ (Double.doubleToLongBits(this.push) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.defence) ^ (Double.doubleToLongBits(this.defence) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.forceAffinity) ^ (Double.doubleToLongBits(this.forceAffinity) >>> 32));
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
        final TrainR4 other = (TrainR4) obj;
        if (!Objects.equals(this.lightSaberUse, other.lightSaberUse)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lightSaberScore) != Double.doubleToLongBits(other.lightSaberScore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.combat) != Double.doubleToLongBits(other.combat)) {
            return false;
        }
        if (Double.doubleToLongBits(this.push) != Double.doubleToLongBits(other.push)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defence) != Double.doubleToLongBits(other.defence)) {
            return false;
        }
        if (Double.doubleToLongBits(this.forceAffinity) != Double.doubleToLongBits(other.forceAffinity)) {
            return false;
        }
        return true;
    }
    
    

    public String getLightSaberUse() {
        return lightSaberUse;
    }

    public void setLightSaberUse(String lightSaberUse) {
        this.lightSaberUse = lightSaberUse;
    }

    public double getLightSaberScore() {
        return lightSaberScore;
    }

    public void setLightSaberScore(double lightSaberScore) {
        this.lightSaberScore = lightSaberScore;
    }

    public double getCombat() {
        return combat;
    }

    public void setCombat(double combat) {
        this.combat = combat;
    }

    public double getPush() {
        return push;
    }

    public void setPush(double push) {
        this.push = push;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getForceAffinity() {
        return forceAffinity;
    }

    public void setForceAffinity(double forceAffinity) {
        this.forceAffinity = forceAffinity;
    }
    
    
    
}
