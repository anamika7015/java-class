package Arraylist;
import java.util.HashSet;
public class Linklist {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        // names.addFirst("table");
        names.add("car");
        names.add("bike");
        names.add("phone");
        // names.addLast("bycycle");
        System.out.println(names);
        names.remove("phone");
        for (String x: names){
            System.out.println(x);
        }

    }
}
