/*

 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;
import java.util.Objects;

public class Ship implements Serializable{
    
    //class instance variables
    private String description;
    private TrainR4 trainR4;
    private Workshop workshop;

    public Ship() {
        this.description = "the ship";
    }

    @Override
    public String toString() {
        return "Ship{" + "description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.description);
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
        final Ship other = (Ship) obj;
        return Objects.equals(this.description, other.description);
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TrainR4 getTrainR4() {
        return trainR4;
    }

    public void setTrainR4(TrainR4 trainR4) {
        this.trainR4 = trainR4;
    }

    public Workshop getWorkshop() {
        return workshop;
    }

    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }
    
    
    
}
