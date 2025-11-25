package level1ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static List<Object> createObjectsList(){
        List<Object> list = new ArrayList<>();

        list.add("Word");
        list.add(434.01);
        list.add("Octopussy");
        list.add(1324164674);
        list.add("Abracadabra");
        list.add(123.56);
        list.add("A");
        list.add("Input");
        return list;
    }

    private static List<String> sortListByDecrementalLength(List<Object> objectsList) {
        List<String> sortedList = objectsList.stream()
                .map(Object::toString)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();
        return sortedList;
    }

    private static void printLists(List<Object> objectsList, List<String> objectsListByIncrementalLength) {
        System.out.println("-- Original List :");
        objectsList.forEach(System.out::println);
        System.out.println("-- Sorted List By Decremental Length :");
        objectsListByIncrementalLength.forEach(System.out::println);
    }

    public static void  main(String[] args){
        List<Object> objectsList;
        List<String> objectsListByDecrementalLength;

        objectsList = createObjectsList();
        objectsListByDecrementalLength = sortListByDecrementalLength(objectsList);
        printLists(objectsList, objectsListByDecrementalLength);
    }
}
