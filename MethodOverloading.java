class Student{
    String name;
    int roll_number;
    
    protected void displayinfo(String name){
        System.out.println(name);
    }
    public void displayinfo(int roll_number){
        System.out.println(roll_number);
    }
    protected void displayinfo(String name,int roll_number){
    System.out.println(name);
    System.out.println(roll_number);
    }
}
public class MethodOverloading{
    public static void main(String[] args){
        Student s1=new Student();
        s1.displayinfo("Fahad Masroor");
        s1.displayinfo(10);
        s1.displayinfo("Fahad",10);
        
    }
}
