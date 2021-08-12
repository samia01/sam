import java.util.Scanner;
import java.lang.Math;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int min = scan.nextInt();
		for(int i=0; i<7; i++) {
			int n = (int)(min+Math.random()*(max-min+1));
			System.out.printf(" %d ",n);
		}
		

	}

}
