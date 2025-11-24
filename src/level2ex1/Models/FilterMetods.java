package level2ex1.Models;

import java.util.List;

public class FilterMetods {

    public static List<String> filterByStarWithCharAand3CharsLength(List<String> inputList){
        List<String> resultList;
        resultList = inputList.stream().filter( word -> (word.startsWith("A") && word.length() == 3)).toList();
        return resultList;
    }
}
