package level2ex1;

import level2ex1.Models.FilterMetods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    private static List<String> createStringList(){
        List<String> list = new ArrayList<>(Arrays.asList("Artemis", "aran", "Ari", "Ana", "anastasia", "Antoni", "Ans", "aso"));
        return list;
    }

    public static void  main(String[] args){
        List<String> list = createStringList();
        List<String> resultList;

        resultList = FilterMetods.filterByStarWithCharAand3CharsLength(list);
        resultList.forEach(System.out::println);
    }
}
