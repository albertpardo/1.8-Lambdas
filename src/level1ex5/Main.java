package level1ex5;

import level1ex5.sol2.interfaces.GetPiValueFunctionalInterface;

public class Main {
    public static void main(String[] args){

        GetPiValueFunctionalInterface myGetPiValueObject = () -> 3.141516;

        System.out.println("myPiValue = " + myGetPiValueObject.getPiValue());
    }
}
