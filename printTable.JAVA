# JAVAPROGRAM

import java.util.Scanner;
class Function{
    public static void printTable(int  n){
    for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"= "+n*i);  
        }
     return;
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
      printTable(n);
    }
}
