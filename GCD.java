import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		int min;
		int gcd=1;
		if(a<b)
			min=a;
		else
			min=b;
		for(int i=1; i<=min; i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			    
		}}
  System.out.printf("%d", gcd);

	}

}
