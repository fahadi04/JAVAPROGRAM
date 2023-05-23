import java.util.Scanner;

public class SOA {
    public static void main(String args[]) {
        int size, i, sum = 0;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter number");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum:" +sum);
    }
}
