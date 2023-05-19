class Dept{
    public void x(){
        System.out.println("Dept name is Btech");
    }
    void display(){
        System.out.println("We are the students of Btech");
    }
    
}
//Sinlgle-level inheritance
class A extends Dept{
    public void y(){
        System.out.println("Our department is phenomenol");
    }
    void display(){
        System.out.println("Something new might to be happend");
    }
}
//Multi-level inheritance
class B extends A{
    public void z(){
        System.out.println("In our department, we have much avail facility ");
    }
    void display(){
        System.out.println("Something had already came");
    }
}
//Heirarchical Inheritance
class C extends Dept{
    public void P(){
        System.out.println("I'm studying in Btech department");
    }
    void display(){
        System.out.println("Something new has to come");
    }
}
public class Inheritance{
    public static void main(String args[]) {
        Dept d1= new Dept();
        d1.x();
        d1.display();
        
        A a1=new A();
        a1.x();
        a1.display();
        
        B b1=new B();
        b1.z();
        b1.display();
        
        C c1= new C();
        c1.x();
        c1.display();
    }
}
