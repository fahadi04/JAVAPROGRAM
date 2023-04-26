import java.util.Scanner;
class Student{
    String name;
    String dept;
    int rollnumber;
    int admissionyear;
    double cgpa;
    public void getinfo(){
        System.out.println("Enter name of the students:"+ this.name);
        System.out.println("Enter dept of the students:"+ this.dept);
        System.out.println("Enter rollnumber of the students:"+ this.rollnumber);
        System.out.println("Enter admissionyear of the students:"+ this.admissionyear);
        System.out.println("Enter cgpa of the students:"+ this.cgpa);
    }
} 
public class Manuu {
    public static void main(String args[]){
        Student s1= new Student();
        s1.name="Fahad";
        s1.dept="CS&IT";
        s1.rollnumber=10;
        s1.admissionyear=2022;
        s1.cgpa=8.00; 

        Student s2= new Student();
        s2.name="Fahad";
        s2.dept="Polytechnic";
        s2.rollnumber=12;
        s2.admissionyear=2019;
        s2.cgpa=9.80;

        s1.getinfo();        
        s2.getinfo();
    }
}
