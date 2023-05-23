
import java.util.Scanner;

public class Array1 {
    public static void main(String args[]) {
        int size, i, sum = 0, pro = 1;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("Enter number of array");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            } else {
                pro = pro * arr[i];
            }
        }
        System.out.println("sum=" + sum);
        System.out.println("pro=" + pro);
    }
}
