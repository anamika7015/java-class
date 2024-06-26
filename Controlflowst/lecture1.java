package Controlflowst;
class ABC{
    void display(){
        System.out.println("hello world");
    }
}
class XYZ extends ABC{
    void display(){
        System.out.println("hello java");
    }
    void info(){
        System.out.println("Anything you want");
    }

}
public class lecture1 {
    public static void main(String[] args) {
        
        XYZ a = new XYZ();
        a.display();
      
        
    }
    
}
