import java.util.*;
public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int [] a = {1,2,3,4};
		
		int[][] arr= {{1,2,3},{2,3,4},{3,4,5}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				//arr[i][j]= scan.nextInt();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println(a.length);
	}

}
