import java.util.*;

class Pattern{
	public static void main(String[] args){
		int N=5;
		System.out.println("The Given Pattern are");
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		
		
	}
}