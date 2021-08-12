import java.util.*;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		//int n;
		int[][] arr= new int[m][n];
		int[][] arr1= new int[n][m];
		//int[][] t= new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr1[i][j]=arr[j][i];
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
	}

}
