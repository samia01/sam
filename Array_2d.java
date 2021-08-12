import java.util.*;
public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int arr[][]= {{1,2,3},{2,4,5},{4,4,5}};
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
			
			System.out.println();
	}
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
			if(i==j) {
				sum+=arr[i][j];
			}
		}
			
			//System.out.println();
	}
		System.out.println(sum);

}
}
