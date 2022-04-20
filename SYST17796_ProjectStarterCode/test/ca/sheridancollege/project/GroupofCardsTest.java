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
public class GroupofCardsTest {
    
    public GroupofCardsTest() {
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
     * Test of gettopCard method, of class GroupofCards.
     */
    @Test
    public void testGettopCard() {
        System.out.println("gettopCard");
        GroupofCards instance = new GroupofCards();
        int expResult = 0;
        int result = instance.gettopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dShuffle method, of class GroupofCards.
     */
    @Test
    public void testDShuffle() {
        System.out.println("dShuffle");
        GroupofCards instance = new GroupofCards();
        instance.dShuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dDraw method, of class GroupofCards.
     */
    @Test
    public void testDDraw() {
        System.out.println("dDraw");
        GroupofCards instance = new GroupofCards();
        Card expResult = null;
        Card result = instance.dDraw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GroupofCards.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GroupofCards instance = new GroupofCards();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class GroupofCards.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GroupofCards.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
