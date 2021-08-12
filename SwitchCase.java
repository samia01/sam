import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int r;
		System.out.println("Enter a:");
		int a= scan.nextInt();
		System.out.println("Enter b:");
		int b= scan.nextInt();
		System.out.println("Enter operator:");
		char op= scan.next().charAt(0);
		System.out.println(op);
		switch(op) {
		case '+': r=a+b;
		          System.out.println(r);
		          break;
		case '-': r=a-b;
        System.out.println(r);
        break;
		case '*': r=a*b;
        System.out.println(r);
        break;
		case '/': r=a/b;
        System.out.println(r);
        break;
		}
		

	}

}
