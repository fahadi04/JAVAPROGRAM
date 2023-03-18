import java.util.Scanner;
public class SOEPofODD {
    public static void main(String f[]){
        System.out.println("Enter number");
        int sum=0 , product=1,digit;
        Scanner Sc = new Scanner(System.in); 
        int n = Sc.nextInt();
        while(n>0){
            digit = n%10;
            if(digit%2==0){
               sum = sum+digit;
                System.out.println(sum);
            } else {
                product = product*digit;
                System.out.println(product);
            }
            n= n/10;
        }
    }
}
