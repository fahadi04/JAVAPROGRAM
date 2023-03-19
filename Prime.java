import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        int i=1,count=0;
        System.out.println("Enter Num to check prime");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i<=n) {
            if(n%i==0) {
                count++;
            } 
            i++; 
        } 
        if(count==2) {
            System.out.println("Number is prime");
        } else{
            System.out.println("Not a prime");
        }  
    }
}
