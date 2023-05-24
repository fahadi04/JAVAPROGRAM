import java.util.Scanner;

public class Array2 {
    public static void main(String args[]) {
        int size, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the number");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            System.out.println("Array at index " + i + " = " + arr[i]);
            System.out.println();
        }
    }
}
