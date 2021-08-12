import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		char p='+';
		char q='*';
		for(int i=0; i<=n; i+=2) {
			System.out.println(" ");
			for(int j=0; j<=i; j++) {
				if(i==0)
				System.out.print(q);
				else if((i%4)==0) {
					System.out.print(q);
				}
				else
					System.out.print(p);
				
				}
			
		}
		

	}
}

