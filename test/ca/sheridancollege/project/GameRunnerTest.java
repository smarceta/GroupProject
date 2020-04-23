/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dancu
 */
public class GameRunnerTest {

    Scanner sc = new Scanner(System.in);

    public GameRunnerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class GameRunner.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GameRunner.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of nameCheck method, of class GameRunner.
     */
    @Test
    public void testNameCheckGood() {
        System.out.println("nameCheckGood");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = "name";
        boolean expResult = true;
        String result = GameRunner.nameCheck(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testNameCheckBad() {
        System.out.println("nameCheckBad");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = "123456";
        boolean expResult = false;
        String result = GameRunner.nameCheck(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testNameCheckBoundary() {
        System.out.println("nameCheckBoundary");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = "name1";
        boolean expResult = true;
        String result = GameRunner.nameCheck(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of ageCheck method, of class GameRunner.
     */
    @Test
    public void testAgeCheckGood() {
        System.out.println("ageCheckGood");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(25);
        boolean expResult = true;
        int result = GameRunner.ageCheck(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testAgeCheckBad() {
        System.out.println("ageCheckBad");
        int age = sc.nextInt(15);
        boolean expResult = false;
        int result = GameRunner.ageCheck(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testAgeCheckBoundary() {
        System.out.println("ageCheckBoundary");
        int age = sc.nextInt(18);
        boolean expResult = true;
        int result = GameRunner.ageCheck(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of balanceCheck method, of class GameRunner.
     */
    @Test
    public void testBalanceCheckGood() {
        System.out.println("balanceCheckGood");
        Scanner sc = new Scanner(System.in);
        double balance = 15.00;
        double expResult = 15.00;
        double result = GameRunner.balanceCheck(sc);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testBalanceCheckBad() {
        System.out.println("balanceCheckBad");
        Scanner sc = new Scanner(System.in);
        double balance = 5.0;
        double expResult = 5.0;
        double result = GameRunner.balanceCheck(sc);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testBalanceCheckBoundary() {
        System.out.println("balanceCheckBoundary");
        Scanner sc = new Scanner(System.in);
        double balance = 10.0;
        double expResult = 10.0;
        double result = GameRunner.balanceCheck(sc);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of betCheck method, of class GameRunner.
     */
    @Test
    public void testBetCheckGood() {
        System.out.println("betCheckGood");
        Scanner sc = new Scanner(System.in);
        double balanceCheck = 30.0;
        double betCheck = 10.0;
        double expResult = 20.0;
        double result = GameRunner.betCheck(sc, balanceCheck);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testBetCheckBad() {
        System.out.println("betCheckBad");
        Scanner sc = new Scanner(System.in);
        double balanceCheck = 5.0;
        double betCheck = 10.0;
        double expResult = -5.00;
        double result = GameRunner.betCheck(sc, balanceCheck);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testBetCheckBoundary() {
        System.out.println("betCheckBoundary");
        Scanner sc = new Scanner(System.in);
        double balanceCheck = 10.0;
        double betCheck = 10.0;
        double expResult = 0.0;
        double result = GameRunner.betCheck(sc, balanceCheck);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
