/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.exceptions;

/**
 *
 * @author David
 */
public class InventoryListControlException extends Exception {

    public InventoryListControlException() {
    }

    public InventoryListControlException(String message) {
        super(message);
    }

    public InventoryListControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public InventoryListControlException(Throwable cause) {
        super(cause);
    }

    public InventoryListControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
