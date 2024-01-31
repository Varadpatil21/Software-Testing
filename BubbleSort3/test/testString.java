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
public class testString {
    
    public testString() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }
    @Test
    public void testString()
    {
       assertSame("Varad",BubbleSort3.stringCompare("Varad"));
    }
    @Test
    public void testString1()
    {
       assertNotSame("Varad1",BubbleSort3.stringCompare("Varad"));
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