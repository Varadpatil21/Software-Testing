/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort3;

/**
 *
 * @author Admin
 */
public class BubbleSort3 {

    /**
     * @param args the command line arguments
     */
   public static int[] BubbleSort(int arr[],int n)
   {
       int temp;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(arr[i]<arr[j])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       return arr;
   }
   
   public static boolean Even(int n)
   {
       if(n%2==0)
           return true;
       return false;
   }
   
   public static double[][] addMatrix(double[][] M1,double[][] M2)
   {
       double[][] M3=new double[2][2];
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               M3[i][j]=M1[i][j]+M2[i][j];
           }
       }
       return M3;
   }
   public static String stringCompare(String s)
   {
       return s;
   }
    
}
