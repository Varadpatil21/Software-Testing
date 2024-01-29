/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication95;

/**
 *
 * @author Admin
 */
public class Myapplication95 {

    /**
     * @param args the command line arguments
     */
   
    public static int addition(int a,int b)
    {
        return (a+b);
    }
     public static int multiplication(int a,int b)
    {
        return (a*b);
    }
     public static int findMax(int arr[])
     {
         int max=arr[0];
         for(int i=1;i<arr.length;i++){
             if(arr[i]>max) 
                 max=arr[i];
             
         }
         return max;
     }
     public static double cube(double a)
     {
         return (a*a*a);
     }
    
}
