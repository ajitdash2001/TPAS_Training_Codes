package Functional_Interfaces;

public class custom_functional {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;


        MathOperation subtraction = (a, b) -> a - b;


        MathOperation multiplication = (a, b) -> a * b;


        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        };


        System.out.println("Addition: " + operate(5, 3, addition));
        System.out.println("Subtraction: " + operate(5, 3, subtraction));
        System.out.println("Multiplication: " + operate(5, 3, multiplication));
        System.out.println("Division: " + operate(6, 3, division));
    }

    public static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
