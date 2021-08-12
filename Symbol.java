import java.util.*;
public class Symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
			System.out.println("letter");
		}
		else if(c>='0' && c<='9'){
			System.out.println("digit");
			}
		else {
			System.out.println("special Character");
		}
		
		

	}

}
