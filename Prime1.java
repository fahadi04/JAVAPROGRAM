import java.util.Scanner;
public class prime1 {
   int a,n;
   public void input() {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    a= sc.nextInt();
   }
   public void output(){
    int count=0;
    while(a<=n){
        if(n%a==0){
            count++;
        }
        a++;
    }
    if(count==2){
        System.out.println("Number is prime");
    }
    else{
        System.out.println("Number is not prime");
    }
   }
   public static void main(String args[]){
    prime1 aa= new prime1();
    aa.input();
    aa.output();
   }
}
