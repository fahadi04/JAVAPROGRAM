import java.util.Scanner;
class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=0;
        int y=1;
        int z=0;
        int n=sc.nextInt();
        System.out.println("Enter values");
        while(z<=n){         //for sum of nth term
        // for(int term=1;term<=n;term++)      //for nth term
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
}
