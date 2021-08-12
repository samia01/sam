import java.util.*;
public class BC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=6; i++) {
			if(i%2==0) {
				break;
			}
			sum += i;
		}
		System.out.println(sum);

	}

}
