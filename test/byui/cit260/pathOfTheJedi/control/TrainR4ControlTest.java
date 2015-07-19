/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import org.junit.Test;

/**
 *
 * @author David
 */
public class TrainR4ControlTest {
    
    public TrainR4ControlTest() {
    }
    
    @Test
    public void testDiceRoll() {
        System.out.println("diceRoll");
        
        //test case #1
        System.out.println("\tTest Case #1");
        TrainR4Control instance = new TrainR4Control();
        double result = instance.diceRoll();
        System.out.println("\tRandom Roll = " + result);
    }
       
    
}
