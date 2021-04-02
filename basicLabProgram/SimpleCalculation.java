import java.util.*;

public class SimpleCalculation 
{ 

	public int sum(int num1,int num2){
		return (num1+num2);
	}
	
	public double sum(double num1,double num2){
		return (num1+num2);
	}	

	public static void main(String[] args) 
	{ 
		SimpleCalculation obj1 = new SimpleCalculation();
		int s1 = obj1.sum(12,12);
		double s2 = obj1.sum(10.0,12.5);
		System.out.println(s1);
		System.out.println(s2);
		
	} 
} 
