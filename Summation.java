
public class Summation {
	public static int sum(int n) {
		int sum=0;
		for(int i=0; i<=n; i++) {
			sum+=i;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int k= sum(5);
       System.out.println(k);
	}

}
