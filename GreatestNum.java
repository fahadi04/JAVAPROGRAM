# JAVAPROGRAM
import java.util.Scanner;
public class greatestNum {
    public static void GreatestNum(int a, int b){
       if(a>b || b>a){
        System.out.println("Greatest Num");
       }else{
        System.out.println("Smaller Num");
       }
    }
    public static void main(String[] args){
        System.out.println("Enter two numbers");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        GreatestNum(a,b);
    }
}
