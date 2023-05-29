import java.util.*;

public class string {
    public static void main(String args[]) {
        String first_name1 = new String();
        String last_name2 = new String();
        String dept = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  first name");
        first_name1 = sc.nextLine();
        System.out.println("Enter your last name");
        last_name2 = sc.nextLine();
        System.out.println("Enter your dept name");
        dept = sc.nextLine();
        System.out.println("First_Name=" + first_name1 + " " + "Last_Name=" + last_name2 + " " + "Department=" + dept);
        
        // concatenation
        String full_name = first_name1 + " " + last_name2;
        System.out.println("full_name=" + full_name);
        // (Name) length
        System.out.println(first_name1.length() + last_name2.length() + dept.length());
       
        // charAt
        for (int i = 0; i < first_name1.length(); i++) {
            System.out.println(first_name1.charAt(i));
        }
        for (int i = 0; i < last_name2.length(); i++) {
            System.out.println(last_name2.charAt(i));
        }
       
        //  (Department) length
        for (int i = 0; i < dept.length(); i++) {
            System.out.println(dept.charAt(i));
        }
      
        // substring
        String S1 = new String("Day and Night");
        System.out.println(first_name1.substring(0, 4));
        System.out.println(last_name2.substring(0, 5));
        System.out.println(dept.substring(0, 3));
        System.out.println(S1.substring(0, 6));
      

        // Replace
        String S2 = new String("Btech");
        System.out.println(S2.replace("B", "M"));
    }
}
