package level2ex4.Model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static List<String> sortListByFirstCharInString(List <String> list){
        return list.stream().sorted(Comparator.comparingInt(string -> string.charAt(0))).toList();
    }

    public static List<String> sortListFirstStringsWithEchar(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(s -> !s.contains("e")))
                .toList();
    }

    public static List<String> listWhereAcharIsChangedTo4number(List <String> list){
        return list.stream()
                .map(s -> s.replace('a', '4'))
                .collect(Collectors.toList());
    }

    public static List<String> getNumbersFromList(List<String> list) {
        String regexDecimal = "^[+-]?([0-9]*\\.)?[0-9]+$";
        return list.stream()
                .filter(s -> s.matches(regexDecimal))
                .toList();
    }
}
