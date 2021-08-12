import java.util.*;
public class Sum_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int arr[][] = new int[m][n];
		int arr1[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
			arr[i][j]=scan.nextInt();
		}
			
			//System.out.println();
	}
	   for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
			arr1[i][j]=scan.nextInt();
			
		}
			
			//System.out.println();
	}
	   for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
			sum[i][j]=arr[i][j]+arr1[i][j];
			System.out.print(sum[i][j]+" ");
		}
			
			System.out.println();
	}

	}

}
