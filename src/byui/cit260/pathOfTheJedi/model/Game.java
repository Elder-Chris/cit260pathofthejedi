/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author David
 */
public class Game implements Serializable {
    
    private double totalTime;
    private Ship ship;
    private InventoryList[] inventory;
    private Player player;
    private String[] actors;
    private Map map;
    private ItemsAvailable[] itemsAvailable;

    public Game() {        
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public InventoryList[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryList[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }    

    public ItemsAvailable[] getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(ItemsAvailable[] itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", ship=" + ship + ", inventory=" + inventory + ", player=" + player + ", actors=" + actors + ", map=" + map + ", itemsAvailable=" + itemsAvailable + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.ship);
        hash = 71 * hash + Arrays.deepHashCode(this.inventory);
        hash = 71 * hash + Objects.hashCode(this.player);
        hash = 71 * hash + Arrays.deepHashCode(this.actors);
        hash = 71 * hash + Objects.hashCode(this.map);
        hash = 71 * hash + Arrays.deepHashCode(this.itemsAvailable);
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.ship, other.ship)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actors, other.actors)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return Arrays.deepEquals(this.itemsAvailable, other.itemsAvailable);
    }






    
    
    

}
