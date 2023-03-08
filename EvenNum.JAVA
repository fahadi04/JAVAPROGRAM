# JAVAPROGRAM
import java.util.Scanner;
class Function{
    public static void printEvenNum(int  n){
        if(n%2==0){
            System.out.println("Number is Even");
            return;
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        
        printEvenNum(n);
    }
}
