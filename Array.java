import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] a;
		a= new int[7];
		int b[] = {1,2,3,4,5};
		int f=0;
		System.out.println(b.length);
		for(int i=0; i<7; i++) {
			a[i]=scan.nextInt();
			System.out.println(a[i]);
		}
		int v=scan.nextInt();
		for(int i=0; i<7; i++) {
			if(a[i]==v) {
				f=1;
				break;
				//System.out.println("found");
			}
			else {
				f=0;
				//System.out.println("not found");
			}
		}
		if(f==1) {
			System.out.println("found");
		}
		else {
			
			System.out.println("not found");
		}
		

	}

}
