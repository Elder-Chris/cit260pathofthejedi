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
 * @author David
 */
public class Location implements Serializable {
    
    private String actorAvailable;
    private String itemAvailable;
    private String itemRemaining;

    public Location() {
    }

    public String getActorAvailable() {
        return actorAvailable;
    }

    public void setActorAvailable(String actorAvailable) {
        this.actorAvailable = actorAvailable;
    }

    public String getItemAvailable() {
        return itemAvailable;
    }

    public void setItemAvailable(String itemAvailable) {
        this.itemAvailable = itemAvailable;
    }

    public String getItemRemaining() {
        return itemRemaining;
    }

    public void setItemRemaining(String itemRemaining) {
        this.itemRemaining = itemRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.actorAvailable);
        hash = 89 * hash + Objects.hashCode(this.itemAvailable);
        hash = 89 * hash + Objects.hashCode(this.itemRemaining);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.actorAvailable, other.actorAvailable)) {
            return false;
        }
        if (!Objects.equals(this.itemAvailable, other.itemAvailable)) {
            return false;
        }
        if (!Objects.equals(this.itemRemaining, other.itemRemaining)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "actorAvailable=" + actorAvailable + ", itemAvailable=" + itemAvailable + ", itemRemaining=" + itemRemaining + '}';
    }
    
    
    
}
