# JAVAPROGRAM
import java.util.Scanner;
class Function {
    public static void voeeligibility(int n){
        int age=n;
        if(age>18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not Elgible for vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter age");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        voteEligibility(n);
    }
}
