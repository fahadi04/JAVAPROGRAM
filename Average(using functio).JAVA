# JAVAPROGRAM
import java.util.Scanner;
class Function {
    public static int calculateAverage(int a, int b,int c){
        int Average = (a+b+c)/3;
        return Average;
    }
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner Sc= new Scanner(System.in);
        int a= Sc.nextInt();
        int b=Sc.nextInt();
        int c=Sc.nextInt();
        int Average= calculateAverage(a,b,c);
        System.out.println("Average of given numbers are:"+Average);
    }
}
