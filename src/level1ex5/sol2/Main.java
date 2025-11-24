package level1ex5;

public class Main {
    /*
    public double  add( double piValue, GetPiValueFunctionalInterface getPiValueFunctionalInterfaceObject){
        return getPiValueFunctionalInterfaceObject.getPiValue(piValue);
    }
    */

    public static void main(String[] args){
        /*
        GetPiValueFunctionalInterface myGetPiValueObject = parameter -> parameter;
        double myPiValue = myGetPiValueObject.getPiValue(3.141516);
*/
        GetPiValueFunctionalInterface myGetPiValueObject = () -> {
            return 3.141516;
        };
        System.out.println("myPiValue = " + myGetPiValueObject.getPiValue());
    }
}
