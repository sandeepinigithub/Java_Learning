import java.util.*;

class Array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the number of column : ");
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++){
				int N = sc.nextInt();
				a[i][j] = N;
			}
		System.out.println("You entered this Array : ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j] + "\t");
				
			}
			System.out.println();
		}
		
	}
}