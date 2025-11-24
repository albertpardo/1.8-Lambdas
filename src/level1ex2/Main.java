package level1ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> filterByCharOAndMore5Chars(List<String> list){
        return list.stream().filter(string -> (string.contains("o") || string.contains("O")) && string.length() > 5).toList();
    }

    private static List<String> createWordList(){
        List<String> list = new ArrayList<>();

        list.add("Hola");
        list.add("Peppa");
        list.add("Car");
        list.add("Octopussy");
        list.add("Music");
        list.add("Octave");
        return list;
    }

    public static void main(String[] args){

        List<String> myStringList;

        myStringList = createWordList();
        System.out.println(filterByCharOAndMore5Chars(myStringList));
    }
}
