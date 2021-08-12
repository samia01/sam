//import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Triangle {
    public static boolean isValid(double a, double b, double c) {
    	if(((a+b)>c) && ((a+c)>b)&&((a+c)>b)) {
    		return true;
    	}
    	
    	else {
     return false;
    	}
    	
    }
    
    public static double Area(double side1, double side2, double side3) {
    	double s;
    	double area;
    	s = ((side1+side2+side3)/2);
    	area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    	return area;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		if(isValid(a,b,c)==true) {
			double R=Area(a,b,c);
			System.out.println(R);
		}
		else {
			System.out.print("invalid");
		}
	}

}
