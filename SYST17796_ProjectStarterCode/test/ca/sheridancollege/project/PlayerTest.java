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
     * Test of getNumBooks method, of class Player.
     */
    @Test
    public void testGetNumBooks() {
        System.out.println("Number Card");
        Player instance = new Player() {
            @Override
            public void haveTurn() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        int expResult = 8;
        int result = instance.numcard;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haveTurn method, of class Player.
     */
    

    public class PlayerImpl extends Player {

        public void haveTurn() {
        }
    }
    
}
