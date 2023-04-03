import java.util.Scanner;
public class PrintTable {
    public static void main(String a[]){
        Scanner f= new Scanner(System.in);
        System.out.println("Enter the number to print the table");
        int i=f.nextInt();
           for(int j=1;j<=10;j++){
            System.out.println(i*j);
        }
    }
}
