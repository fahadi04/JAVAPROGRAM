# JAVAPROGRAM
import java.io.*;
public class ADD {
    public static void main(String[] args)throws IOException
    {
        int a,b,c;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter Second number");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("ADDITION of Two Num Are:-"+c);
    }
}
