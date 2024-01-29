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
public class MyJUnitTest {
     static int  a,b;
    
    public MyJUnitTest() {
    }
    
    @BeforeClass
    public  static void setUpClass() {
        System.out.println("Before Class");
       a=3;
       b=5;
    }
    @Test
    public void testadd(){
        assertEquals(8,Myapplication95.addition(a,b));
    }
    @Test
    public void testmultiply(){
        assertEquals(20,Myapplication95.multiplication(a,b));
    }
    @Test
    public void testcube(){
      assertEquals(9.2610,Myapplication95.cube(2.1),0.0001);
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
