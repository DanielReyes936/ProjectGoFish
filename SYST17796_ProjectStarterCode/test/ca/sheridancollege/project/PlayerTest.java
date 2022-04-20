/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kelly
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of test method, of class Player.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        Player instance = null;
        instance.test();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfHandCards method, of class Player.
     */
    @Test
    public void testGetNoOfHandCards() {
        System.out.println("getNoOfHandCards");
        Player instance = null;
        int expResult = 0;
        int result = instance.getNoOfHandCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerNo method, of class Player.
     */
    @Test
    public void testGetPlayerNo() {
        System.out.println("getPlayerNo");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPlayerNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookNo method, of class Player.
     */
    @Test
    public void testGetBookNo() {
        System.out.println("getBookNo");
        Player instance = null;
        int expResult = 0;
        int result = instance.getBookNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardAdd method, of class Player.
     */
    @Test
    public void testCardAdd() {
        System.out.println("cardAdd");
        Card c = null;
        Player instance = null;
        instance.cardAdd(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardTransfer method, of class Player.
     */
    @Test
    public void testCardTransfer() {
        System.out.println("cardTransfer");
        int cRank = 0;
        Player p = null;
        Player instance = null;
        instance.cardTransfer(cRank, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cardRemove method, of class Player.
     */
    @Test
    public void testCardRemove() {
        System.out.println("cardRemove");
        int index = 0;
        Player instance = null;
        instance.cardRemove(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBook method, of class Player.
     */
    @Test
    public void testFindBook() {
        System.out.println("findBook");
        Player instance = null;
        instance.findBook();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Player.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Player.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
