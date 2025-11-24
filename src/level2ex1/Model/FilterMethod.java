package level2ex1.Model;

import java.util.List;

public class FilterMethod {

    public static List<String> filterByStarWithCharAand3CharsLength(List<String> inputList){
        List<String> resultList;
        resultList = inputList.stream().filter( word -> (word.startsWith("A") && word.length() == 3)).toList();
        return resultList;
    }
}
