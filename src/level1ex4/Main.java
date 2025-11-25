package level1ex4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // alternative using Method Reference. It's a special form for lambdas
    private static void printMonthNamesWithMethodReference(List<String> listMonths){
        System.out.println("-- List of Months of year (using Method Reference):");
        listMonths.forEach(System.out::println);
    }

    private static List<String> createMonthsNameList(){
        return Arrays.asList("January",  "February", "March",  "April", "May", "June", "July", "August", "September", "October", "November", "December");
    }

    public static void main(String[] args){

        List<String> months;

        months = createMonthsNameList();
        printMonthNamesWithMethodReference(months);
    }
}
