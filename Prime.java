
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; 
		int b=100;
		generatePrime(0,100);		

	}
	public static boolean isPrime(int n){
		//boolean r=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void generatePrime(int a, int b) {
		for(int i=a; i<=b; i++) {
			if(isPrime(i)==true) {
				System.out.print(" "+i);
			}
		}
	}

}
