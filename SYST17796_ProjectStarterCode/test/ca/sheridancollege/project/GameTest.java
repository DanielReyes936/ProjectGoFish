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
public class GameTest {
    
    public GameTest() {
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
     * Test of noOfPlayers method, of class Game.
     */
    @Test
    public void testNoOfPlayers() {
        System.out.println("noOfPlayers");
        Game instance = new Game();
        instance.noOfPlayers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turn method, of class Game.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        Player PA = null;
        Game instance = new Game();
        Player expResult = null;
        Player result = instance.turn(PA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of winnerGet method, of class Game.
     */
    @Test
    public void testWinnerGet() {
        System.out.println("winnerGet");
        Game instance = new Game();
        instance.winnerGet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gameStart method, of class Game.
     */
    @Test
    public void testGameStart() {
        System.out.println("gameStart");
        Game instance = new Game();
        instance.gameStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Game.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
