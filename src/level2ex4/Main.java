package level2ex4;

import level2ex4.Model.Filters;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<String> createStringsList(){
        return Arrays.asList("One", "125", "April", "event", "2580", "Clarinet", "99", "Year", "animal", "Element", "25.4");
    }

    private static void printListWithHeader(List<String> list, String header){
        System.out.println(header);
        list.forEach(System.out::println);
    }

    private static void printResultListWithHeader(List<String> list, String header){
        printListWithHeader(list, header);
        System.out.println("---------");
    }

    private static void printSortedByFirstStringChar(List<String> list){
        List<String> resultList;

        resultList = Filters.sortListByFirstCharInString(list);
        printResultListWithHeader(resultList, "-- List sorted by first char of the string:");
    }

    private static void printSortedByStringsWithEfirst(List<String> list) {
        List<String> resultList;

        resultList = Filters.sortListFirstStringsWithEchar(list);
        printResultListWithHeader(resultList, "-- List where first strings contains 'e':");
    }

    private static void printListWhereAcharIsChangedTo4number(List<String> list) {
        List<String> resultList;

        resultList = Filters.listWhereAcharIsChangedTo4number(list);
        printResultListWithHeader(resultList, "-- List where 'a' is change to '4' :");
    }

    private static void printOnlyStringNumbersFormList(List<String> list) {
        List<String> resultList;

        resultList = Filters.getNumbersFromList(list);
        printResultListWithHeader(resultList, "-- List only with String Numbers :");
    }

    public static void main(String[] args){
        List<String> list;

        list = createStringsList();
        printListWithHeader(list, "-- Original list:");
        printSortedByFirstStringChar(list);
        printSortedByStringsWithEfirst(list);
        printListWhereAcharIsChangedTo4number(list);
        printOnlyStringNumbersFormList(list);
    }
}
