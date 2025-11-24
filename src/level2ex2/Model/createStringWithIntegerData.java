package level2ex2.Model;

import java.util.List;
import java.util.stream.Collectors;

public class createStringWithIntegerData {
    public static String stringWithEvenAndOddIntegers(List<Integer> integers){
        String result = integers.stream()
                .map(i -> (i % 2 == 0 ? "e" : "o") + i)
                .collect(Collectors.joining(", "));
        return result;
    }
}
