import java.util.*;
public class Perfect_number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2; i<=n; i++) {
			if(PerfectNumber(i)==1) {
				System.out.println(i);
			}
			
		}
    
	}
	
	public static int PerfectNumber(int n){
		int sum=1;
		int r=0;

			for(int j=2; j<=(n/2); j++) {
				 if(n%j==0) {
					 sum+=j;
				 }
			     }
			if(sum==n) {
						r= 1;
					}
			else {
					r= 0;
					}
				 
	return r;	
		
	}
	

}
