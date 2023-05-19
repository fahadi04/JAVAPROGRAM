class Student{
    public void X(){
    System.out.println("We are the student of 2nd year");
   }
}
class  A extends Student{
    public void X(){
        System.out.println("The Students of 2nd year are good enough");
    } 
}
public class MethodOverriding{
    public static void main(String[] args){
        A a2=new A();
        a2.X();
    }
}
