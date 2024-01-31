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
public class SortTest {
    
    public SortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }
    @Test
    public void testSort1(){
        assertArrayEquals(new int[]{5,7,8,9,12},BubbleSort3.BubbleSort(new int[]{5,8,9,12,7}, 5));
    }
     @Test
    public void testSort2(){
        assertArrayEquals(new int[]{12,9,8,7,5},BubbleSort3.BubbleSort(new int[]{5,8,9,12,7}, 5));
    }
     @Test
    public void testSort3(){
        assertArrayEquals(new int[]{12,9,8,7},BubbleSort3.BubbleSort(new int[]{5,8,9,12,7}, 5));
    }
     @Test
    public void testSort4(){
        assertArrayEquals(new int[]{10,20,30,40,50},BubbleSort3.BubbleSort(new int[]{50,40,30,20,10}, 5));
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
