package Controlflowst;

public class Exception {
    public static void main(String[] args) {
        try{

            int[] myarray = {10,20,30,40,50};
            System.out.println(myarray[6]);
        }
        catch(Exception e){
            System.out.println("Exception is" +e);
        }
    }
}
