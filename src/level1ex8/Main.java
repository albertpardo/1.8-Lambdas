package level1ex8;

import level1ex8.interfaces.ReverseFunctionalInterface;

public class Main {
    public static void main(String[] args){
        String inputString = "This is the string to reverse";
        String reversedString;
        ReverseFunctionalInterface reverseFunctionalInterface = (inputStr) -> new StringBuilder(inputStr).reverse().toString();

        reversedString = reverseFunctionalInterface.reverse(inputString);
        System.out.println("-- String to reverse : ");
        System.out.println(inputString);
        System.out.println("-- Reversed string: ");
        System.out.println(reversedString);
    }
}
