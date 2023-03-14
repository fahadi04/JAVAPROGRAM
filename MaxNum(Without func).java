# JAVAPROGRAM
import java.util.Scanner;
public class MaxNum {
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number");
        Scanner Sc = new Scanner(System.in);
        a = Sc.nextInt();
        b = Sc.nextInt();
        if(a>b){
            System.out.println("Max Number="+a);
            // return 0;
        } else{
            System.out.println("Max Num="+b);
        }
    }
    
}
