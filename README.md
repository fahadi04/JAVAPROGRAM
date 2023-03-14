# JAVAPROGRAM
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        System.out.println("Enter numbers");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println("Enetr your choice 1> Addition 2>Subtraction 3>Multiply 4>Division");
        int ch = Sc.nextInt();
        switch(ch) {
            case 1:
            System.out.println("Addition = "+(a+b));
            break;
            case 2:
                System.out.println("Subtraction = "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication = "+(a*b));
                break;
            case 4:
                System.out.println("Division = "+(a/b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
