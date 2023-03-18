# jAVAPROGRAM
import java.util.Scanner;
public class armStrong {
    public static void main(String f[]){
        int sum=0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Sc.nextInt();
        while(n>0){
            sum =sum + n%10; //logic
            n = n/10;        //logic
        }
    System.out.println("Sum of the given number:-"+ sum);
    }
}
