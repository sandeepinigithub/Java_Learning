import java.util.*;

class Factorial{
	public static void main(String[] args){
		int N,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
	    N = sc.nextInt();
		for(int i=1;i<=N;i++){
			fact = fact*i;				
		}
		System.out.println("Factorial of a number :" + fact);
	}
}