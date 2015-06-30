/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.exceptions;

/**
 *
 * @author Technology Handyman
 */
public class TrainR4ControlException extends Exception {

    public TrainR4ControlException() {
    }

    public TrainR4ControlException(String message) {
        super(message);
    }

    public TrainR4ControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrainR4ControlException(Throwable cause) {
        super(cause);
    }

    public TrainR4ControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
