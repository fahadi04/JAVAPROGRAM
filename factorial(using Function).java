# JAVAPROGRAM
import java.util.Scanner;
public class Function{
    public static void printFactorial(int n){
        int factorial = 1;
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        printFactorial(n);
    }
}
