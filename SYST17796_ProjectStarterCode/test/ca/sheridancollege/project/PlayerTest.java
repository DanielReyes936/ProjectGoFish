/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmdan
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of hasGiven method, of class Player.
     */
    @Test
    public void testHasGiven() {
        System.out.println("hasGiven");
        Card cType = null;
        Player instance = new PlayerImpl();
        boolean expResult = false;
        boolean result = instance.hasGiven(cType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveAll method, of class Player.
     */
    @Test
    public void testGiveAll() {
        System.out.println("giveAll");
        Card cType = null;
        Player instance = new PlayerImpl();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.giveAll(cType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumBooks method, of class Player.
     */
    @Test
    public void testGetNumBooks() {
        System.out.println("getNumBooks");
        Player instance = new PlayerImpl();
        int expResult = 0;
        int result = instance.getNumBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haveTurn method, of class Player.
     */
    @Test
    public void testHaveTurn() {
        System.out.println("haveTurn");
        Player instance = new PlayerImpl();
        instance.haveTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayerImpl extends Player {

        public void haveTurn() {
        }
    }
    
}
