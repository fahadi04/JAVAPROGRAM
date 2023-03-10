# JAVAPROGRAM
import java.util.Scanner;
public class SumofoddNum {
    public static int additionofOddNum(int n){
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
        }
        System.out.println(sum);
        return 1;
    }
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner Sc = new Scanner(System.in);
        int data= Sc.nextInt();
        additionofOddNum(data); 
    }
}
