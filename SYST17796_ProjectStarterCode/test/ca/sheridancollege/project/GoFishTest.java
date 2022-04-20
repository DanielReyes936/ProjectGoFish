/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmdan
 */
public class GoFishTest {
    
    public GoFishTest() {
    }
    
    @Before
    public void setUp() {
    }

   
    /**
     * Test of deckSize method, of class GoFish.
     */
    @Test
    public void testDeckSize() {
        System.out.println("deckSize");
        int expResult = 0;
        int result = GoFish.deckSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
