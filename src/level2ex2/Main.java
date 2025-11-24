package level2ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static level2ex2.Model.createStringWithIntegerData.stringWithEvenAndOddIntegers;

public class Main {

    public static void  main(String[] args){
        List<Integer> integers;
        String result;

        integers = new ArrayList<>(Arrays.asList(3, 55, 44));
        result = stringWithEvenAndOddIntegers(integers);
        System.out.println("--Test 1:");
        System.out.println(result);
        integers = new ArrayList<>(Arrays.asList(1, 50, 1003, 3, 42, 7));
        result = stringWithEvenAndOddIntegers(integers);
        System.out.println("--Test 2:");
        System.out.println(result);

    }
}
