import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int arr[][] = new int[m][n];
		//int arr1[][] = new int[m][n];
		int sum[][] = new int[n][m];
		
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
			arr[i][j]=scan.nextInt();
		}
			
			//System.out.println();
	}
			
			//System.out.println();
	
	   for(int i=0; i<n;i++) {
			for(int j=0; j<m;j++) {
			sum[i][j]=arr[j][i];
			System.out.print(sum[i][j]+" ");
		}
			
			System.out.println();
	}

	}

}
