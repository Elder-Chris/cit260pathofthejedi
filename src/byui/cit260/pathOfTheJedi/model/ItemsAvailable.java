/*

 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 
 */
public class ItemsAvailable implements Serializable{
    
    public static ArrayList<ItemsAvailable> ItemsAvail = new ArrayList<>();
    public static ArrayList<ItemsAvailable> OnHand = new ArrayList<>();
    
    private String type;
    private String planet;
    private double power;
    


    public ItemsAvailable() {
    }
    
    public ItemsAvailable(String type, String planet, double power) {
        this.type = type;
        this.planet = planet;
        this.power = power;
                
    } 

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }    

    @Override
    public String toString() {
        return "ItemsAvailable{" + "type=" + type + ", planet=" + planet + ", power=" + power + '}';
    }   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.planet);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.power) ^ (Double.doubleToLongBits(this.power) >>> 32));
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
        final ItemsAvailable other = (ItemsAvailable) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.planet, other.planet)) {
            return false;
        }
        if (Double.doubleToLongBits(this.power) != Double.doubleToLongBits(other.power)) {
            return false;
        }
        return true;
    }     
}
