import java.util.Scanner;
public class rev1 {
    int a;
    void getdata(int i){
        a=i;
    }
    int putdata(){
        int rev=0;
        while(a>0){
            rev=(rev*10)+(a%10);
            a=a/10;
        }
        System.out.println("Reverse:" +rev);
       // return rev;
    }
        public static void main(String args[]){
            int b,val;
            rev1 aa= new rev1();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to be reversed");
        b=sc.nextInt();
        aa.getdata(b);
        aa
        //val=aa.putdata();
        System.out.println(val);
        }
}
