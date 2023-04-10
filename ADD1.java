import java.util.Scanner;
public class ADD1 {
    int a,b;     // class  variable

    void getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        a= sc.nextInt();
        System.out.println("Enter 2nd number");
        b=sc.nextInt();
    }
    void putdata(){
        System.out.println("Addition:"+(a+b));
    }
    public static void main(String a[]){
        ADD1 aa=new ADD1();    // object
        aa.getdata();         
        aa.putdata();          
    }
}
