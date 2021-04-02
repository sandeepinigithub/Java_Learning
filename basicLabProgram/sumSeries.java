// Print sum of series 1+x+x2+x3+......+xn 

import java.io.*;
import java.lang.Math;
import java.util.*;
 
class sumSeries
{ 
      public static void main(String ar[])
      {
            double i,x=0,n=0,sum=0;
            DataInputStream obj= new DataInputStream(System.in);

            try
            {

                  System.out.println("Enter the value of x:");
                  x=Integer.parseInt(obj.readLine());
                  System.out.println("Enter the value of n:");
                  n=Integer.parseInt(obj.readLine());
            }
 
            catch(IOException e)
            {
            }
            for(i=0;i<=n;i++)
            sum=sum+Math.pow(x,i);
            System.out.println("Sum is:"+sum);
      }
}