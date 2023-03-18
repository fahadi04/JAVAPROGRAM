import java.util.Scanner;
public class Palindrome {
    public static void main(String f[]){
        System.out.println("Enter the number");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int rev=0,z;
        z=n;
        while(n>0){
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        if(rev==z){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
