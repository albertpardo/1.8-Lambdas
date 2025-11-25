package level2ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    private static List<String> createStringsList(){
        List<String> list = Arrays.asList("One", "125", "April", "event", "2540", "Clarinet", "99", "Year");
        return list;
    }
    public static void main(String[] args){
        List<String> list;

        list = createStringsList();

        list.forEach(System.out::println);
        
    }
}
