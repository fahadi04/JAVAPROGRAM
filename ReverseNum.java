import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        System.out.println("Enter number to be reverse");
        Scanner Sc = new Scanner(System.in);
        int rev=0; 
        int n = Sc.nextInt();
        while(n>0){
            rev=(rev*10)+n%10;    // logic to reverse the number
            n=(n/10);            // logic to reverse the number
        }
        System.out.println("Reverse num=" + rev);
    }
}
