package level1ex3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static void printMonthNamesWithLambdas(List<String> listMonths){
        System.out.println("-- List of Months of year (using Lambda):");
        listMonths.forEach(month -> System.out.println(month));
    }

    private static List<String> createMonthsNameList(){
        List<String> list = Arrays.asList("January",  "February", "March",  "April", "May", "June", "July", "August", "September", "October", "November", "December");
        return list;
    }

    public static void main(String[] args){

        List<String> months;

        months = createMonthsNameList();
        printMonthNamesWithLambdas(months);
    }
}
