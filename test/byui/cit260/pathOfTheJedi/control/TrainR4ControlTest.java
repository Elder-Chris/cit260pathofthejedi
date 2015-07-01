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
    //@Test
    /*public void testCalcCombat() {
      *  System.out.println("calcCombat");
        
        //test case #1
        System.out.println("\tTest Case #1");
        double combatLv = 4.0;
        double diceRoll = 6.0;
        TrainR4Control instance = new TrainR4Control();
        double expResult = 5.0;
        double result = instance.calcCombat(combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);        
        
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
        /**
     * Test of calcPush method, of class TrainR4Control.
     */
    /*@Test
    public void testCalcPush() {
        System.out.println("calcPush");
        
        //test case #1
        System.out.println("\tTest Case #1");
        double pushLv = 2.0;
        double combatLv = 4.0;
        double diceRoll = 3.0;
        TrainR4Control instance = new TrainR4Control();
        double expResult = 3.0;
        double result = instance.calcDefence(pushLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
       
        System.out.println("\tTest Case #2");
        pushLv = 10;
        combatLv = 4.0;
        diceRoll = 6.0;
        
        expResult = -1.0;
        result = instance.calcDefence(pushLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
        //test case #3
        System.out.println("\tTest Case #3");
        pushLv = 2.0;
        combatLv = 4.0;
        diceRoll = 6.0;
        
        expResult = -1.0;
        result = instance.calcDefence(pushLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #4
        System.out.println("\tTest Case #4");
        pushLv = 1.0;
        combatLv = 1.0;
        diceRoll = 3.0;
        
        expResult = 2.0;
        result = instance.calcDefence(pushLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #5
        System.out.println("\tTest Case #5 ");
        pushLv = 9.0;
        combatLv = 10.0;
        diceRoll = 4.0;
        
        expResult = 10.0;
        result = instance.calcDefence(pushLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
     * Test of calcDefence method, of class TrainR4Control.
     */
    /*@Test
    public void testCalcDefence() {
        System.out.println("calcDefence");
        
        //test case #1
        System.out.println("\tTest Case #1");
        double defenceLv = 2.0;
        double combatLv = 4.0;
        double diceRoll = 3.0;
        TrainR4Control instance = new TrainR4Control();
        double expResult = 3.0;
        double result = instance.calcDefence(defenceLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
                
        //test case #2
        System.out.println("\tTest Case #2");
        defenceLv = 10;
        combatLv = 4.0;
        diceRoll = 6.0;
        
        expResult = -1.0;
        result = instance.calcDefence(defenceLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #3
        System.out.println("\tTest Case #3");
        defenceLv = 2.0;
        combatLv = 4.0;
        diceRoll = 6.0;
        
        expResult = -1.0;
        result = instance.calcDefence(defenceLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #4
        System.out.println("\tTest Case #4");
        defenceLv = 1.0;
        combatLv = 1.0;
        diceRoll = 3.0;
        
        expResult = 2.0;
        result = instance.calcDefence(defenceLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #5
        System.out.println("\tTest Case #5 ");
        defenceLv = 9.0;
        combatLv = 10.0;
        diceRoll = 4.0;
        
        expResult = 10.0;
        result = instance.calcDefence(defenceLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);      
    }
    
    /**
     * Test of calcForceAffinity method, of class TrainR4Control.
     */
    /*@Test
    public void testCalcForceAffinity() {
        System.out.println("calcForceAffinity");
        
        //test case #1
        System.out.println("\tTest Case #1");
        double forceAffinityLv = 2.0;
        double combatLv = 4.0;
        double diceRoll = 3.0;
        TrainR4Control instance = new TrainR4Control();
        double expResult = 3.0;
        double result = instance.calcForceAffinity(forceAffinityLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
                
        //test case #2
        System.out.println("\tTest Case #2");
        forceAffinityLv = 10;
        combatLv = 4.0;
        diceRoll = 6.0;
        
        expResult = -1.0;
        result = instance.calcForceAffinity(forceAffinityLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #3
        System.out.println("\tTest Case #3");
        forceAffinityLv = 2.0;
        combatLv = 4.0;
        diceRoll = 6.0;
        
        expResult = -1.0;
        result = instance.calcForceAffinity(forceAffinityLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #4
        System.out.println("\tTest Case #4");
        forceAffinityLv = 1.0;
        combatLv = 1.0;
        diceRoll = 3.0;
        
        expResult = 2.0;
        result = instance.calcForceAffinity(forceAffinityLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);
        
         //test case #5
        System.out.println("\tTest Case #5 ");
        forceAffinityLv = 9.0;
        combatLv = 10.0;
        diceRoll = 4.0;
        
        expResult = 10.0;
        result = instance.calcForceAffinity(forceAffinityLv, combatLv, diceRoll);
       
        assertEquals(expResult, result, 0.0);      
    }
    
    /**
     * Test of diceRoll method, of class TrainR4Control.
     */
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
