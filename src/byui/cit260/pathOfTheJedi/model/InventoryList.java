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
public class InventoryList implements Serializable{
    
    //class instance variables
    private String type;
    private double quantity;
    private double amount;

    public InventoryList() {
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InventoryList{" + "type=" + type + ", quantity=" + quantity + ", amount=" + amount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
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
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        return true;
    }
    
    
}
