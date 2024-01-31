/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import bubblesort3.BubbleSort3;
/**
 *
 * @author Admin
 */
public class testEvenCheck {
    
    public testEvenCheck() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }
    @Test
    public  void checkeven(){
        assertTrue(BubbleSort3.Even(42));
    }
    @Test
    public  void checkeven1(){
        assertTrue(BubbleSort3.Even(43));
    }
    @Test
    public  void checkeven2(){
        assertFalse(BubbleSort3.Even(43));
    }
   
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After Class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
