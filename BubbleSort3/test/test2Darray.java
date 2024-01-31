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
public class test2Darray {
    
    public test2Darray() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }
    @Test
    public void test2DArray()
    {
        assertArrayEquals(new double[][]{{3.2,3.2},{3.2,3.2}},BubbleSort3.addMatrix(new double[][]{{1.1,1.1},{1.1,1.1}}, new double[][]{{2.1,2.1},{2.1,2.1}}));
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
