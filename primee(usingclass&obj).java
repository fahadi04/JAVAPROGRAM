import java.util.Scanner;
public class primee {
    int a;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a= sc.nextInt();
    }
    void putdata(){
        int x,count=0;
        for(x=1;x<=a;x++){
            if(a%x==0)
            count++;
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    public static void main(String args[]){
        primee aa= new primee();
        aa.getdata();
        aa.putdata();
    }
}
