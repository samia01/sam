
public class CB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				continue;
				//break;
			}
			  sum +=i;
			  
			
		}
		System.out.println(sum);

	}

}
