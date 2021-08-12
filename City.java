import java.util.*;
public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		char p, q;
		String city1, city2;
		city1 = scan.next();
		city2 = scan.next();
		p = city1.charAt(0);
		q = city2.charAt(0);
		//int c=Character.compare(p, q);
		if(p<q) {
			System.out.printf("%s %s",city1, city2);
		}
		else
			System.out.printf("%s %s", city2, city1);
		
		
		

	}

}
