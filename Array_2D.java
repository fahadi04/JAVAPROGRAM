import java.util.Scanner;

public class Array_2D {
    public static void main(String args[]) {
        int size, j, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        size = sc.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Enter number");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
