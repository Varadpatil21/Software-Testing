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
import myapplication95.Myapplication95;

/**
 *
 * @author Admin
 */
public class ArrayJUnitTest {
    
    public ArrayJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }
    
    @Test
    public void testFindMax(){
        assertEquals(45,Myapplication95.findMax(new int[]{10,30,45,21}));
        assertEquals(-1,Myapplication95.findMax(new int[]{-12,-5,-10,-1}));
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
