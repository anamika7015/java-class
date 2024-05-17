package Controlflowst;


public class Controlflow{
public static void main(String [] args){
    int x= 10;
    if (x>5) {
        System.out.println("x is greater than 5");
        
    }
    else{
        System.out.println("x is less than or equal to 5");
    }
    int y=20;
    if (y == 10) {
        System.out.println("y is equal to 10");
    }
    else if(y== 20){
        System.out.println("y is equal tp 20");
    }
    else{
        System.out.println("y neither  10 or nor 20");
    }
    
}

}