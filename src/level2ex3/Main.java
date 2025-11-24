package level2ex3;

import level2ex3.Interfaces.MathOperationFunctionalInterface;

public class Main {
    public static void main(String[] args){
        MathOperationFunctionalInterface add = (a, b) -> a + b;
        MathOperationFunctionalInterface substraction = (a , b) -> a - b;
        MathOperationFunctionalInterface product = (a, b) -> a * b;
        MathOperationFunctionalInterface division = (a, b) -> a / b;

        System.out.println("Add operation : 40 + 1.1 = " + add.operation( 40.0f , 1.1f));
        System.out.println("Substraction operation : 25.4 - 5.1 = " + substraction.operation(25.4f, 5.1f));
        System.out.println("Product operation : 2.2 * 10.0 = " + product.operation(2.2f, 10.0f));
        System.out.println("Division operation : 1000.0 / 20.0 = " + division.operation(1000.0f, 20.0f));
    }
}
