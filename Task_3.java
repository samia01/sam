import java.util.Scanner;

public class Task_3 {
    public static int isPrime(int n){
        int result=1;
        if(n<2)
            result=0;
        else{
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    result=0;
                    break;
                }
            }
        }
        return result;
    }
    public static void generatePrime(int a,int b){
        
        System.out.printf("Prime Number between %d and %d ",a,b);
        
        for(int i=a;i<=b;i++){
            if(isPrime(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a=scanner.nextInt();
        System.out.println("Enter B");
        int b=scanner.nextInt();
        generatePrime(a,b);
        
    }
}
//</editor-fold>