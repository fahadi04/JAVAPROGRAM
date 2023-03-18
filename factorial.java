import java.util.Scanner;
public class factorial {
    public static void main(String f[]){
        int i, fact=1;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number forfactorial");
        int n = Sc.nextInt();
        for(i=n;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("factorial of given number:-"+ fact);
    }
    
}
