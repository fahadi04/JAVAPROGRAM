class student {
    int roll;
    String name;
    static String dept = "B.Tech(CS&IT)";
    static String c_name = "ABC";

    student(int x, String y) {
        this.roll = x;
        this.name = y;
    }

    void display() {
        System.out.println("roll=" + roll + "name=" + name + "dept=" + dept + "c_name=" + c_name);
    }

    static void update() {
        c_name = "MANUU";
    }
}

public class staticmemberfunc {
    public static void main(String args[]) {
        student s1 = new student(10, "Fahad");
        student s2 = new student(20, "Danish");
        s1.display();
        s2.display();
        student.update();
        s1.display();
        s2.display();
    }
}
