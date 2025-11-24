package level1ex3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static void printMonthNamesWithLambdas(List<String> listMonths){
        System.out.println("-- List of Months of year (using Lambda):");
        listMonths.forEach(m -> System.out.println(m));
    }

    // alternative using Method Reference. It's a special form for lambdas
    private static void printMonthNamesWithMethodReference(List<String> listMonths){
        System.out.println("-- List of Months of year (using Method Reference):");
        listMonths.forEach(System.out::println);
    }

    private static List<String> createMonthsNameList(){
        List<String> list = new ArrayList<>(Arrays.asList("January",  "February", "March",  "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        return list;
    }

    public static void main(String[] args){

        List<String> months;

        months = createMonthsNameList();
        printMonthNamesWithLambdas(months);
        System.out.println();
        printMonthNamesWithMethodReference(months);
    }
}
