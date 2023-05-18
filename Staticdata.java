class Student {
    int roll_number;
    String name;
    static String c_name = "MANUU";
    static String dept_name = "B.Tech";

    Student(int x, String y) {
        this.roll_number = x;
        this.name = y;
    }

    void display() {
        System.out.println("Name=" + name + "roll_number=" + roll_number + "c_name=" + c_name);
    }
}

public class Staticdata {
    public static void main(String args[]) {
        Student S1 = new Student(10, "Fahad");
        Student S2 = new Student(20, "Danish");
        S1.display();
        S2.display();
    }
}
