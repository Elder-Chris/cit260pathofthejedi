/*

 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;
import java.util.Objects;
/**

 */
public class InventoryList implements Serializable{       
    
    //class instance variables
    private String type;
    private double quantity;

    public InventoryList() {
    }
    
    public InventoryList(String type, double quantity) {
        this.type = type;
        this.quantity = quantity;
    }
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "InventoryList{" + "type=" + type + ", quantity=" + quantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
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
        final InventoryList other = (InventoryList) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return Double.doubleToLongBits(this.quantity) == Double.doubleToLongBits(other.quantity);
    }

    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
