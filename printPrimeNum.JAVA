# JAVAPROGRAM

import java.util.Scanner;
public class Function{
    public static void printPrimeNum(int  n){
        if(n/1==1){
            System.out.println("Invalid Option");
            return;
        }
        if(n/n==1  && n/1==n){
            System.out.println("Number is prime");
            return;
        }else{
            System.out.println("Number is not prime");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        
        printPrimeNum(n);
    }
}
