# JAVAPROGRAM
import java.util.Scanner;
class Function {
    public static void greaterNumbers(int a, int b){
        // int n=
        if(a>b || b>a){
            System.out.println("Greater number");
        }
         else{
            System.out.println("Invalid Choice");
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner Sc= new Scanner(System.in);
        int a= Sc.nextInt();
        int b=Sc.nextInt();
        greaterNumbers(a,b);
    }
}
