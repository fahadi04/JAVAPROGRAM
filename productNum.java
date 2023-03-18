import java.util.Scanner;
public class productNum {
    public static void main(String f[]){
        int product =1;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = Sc.nextInt();
        while(n>0){
            product = product*(n%10);
            n= n/10;
        }
    System.out.println("Product of the given number:-" + product);
    }
}
