/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pathOfTheJedi.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class TrainR4ControlTest {
    
    public TrainR4ControlTest() {
    }

    /**
     * Test of calcCombat method, of class TrainR4Control.
     */
    @Test
    public void testCalcCombat() {
        System.out.println("calcCombat");
        
        //test case #1
        System.out.println("\tTest Case #1");
        double combatLv = 4.0;
        double diceRoll = 6.0;
        TrainR4Control instance = new TrainR4Control();
        double expResult = 5.0;
        double result = instance.calcCombat(combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case 1 fail.");
        
        //test case #2
        System.out.println("\tTest Case #2");
        combatLv = 10.0;
        diceRoll = 6.0;
        
        expResult = -1.0;
        result = instance.calcCombat(combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #3
        System.out.println("\tTest Case #3");
        combatLv = 5.0;
        diceRoll = 2.0;
        
        expResult = -1.0;
        result = instance.calcCombat(combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #4
        System.out.println("\tTest Case #4");
        combatLv = 1.0;
        diceRoll = 1.0;
        
        expResult = 2.0;
        result = instance.calcCombat(combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #5
        System.out.println("\tTest Case #5 ");
        combatLv = 9.0;
        diceRoll = 6.0;
        
        expResult = 10.0;
        result = instance.calcCombat(combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
        
    
    
    
    
    }
    
}
