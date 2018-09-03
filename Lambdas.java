package cwiczenia;

public class Lambdas {
    public static void main(String[] args) {
        MathOperation addition = (double a, double b) -> a + b;
        MathOperation subtraction = (double a, double b) -> a - b;
        MathOperation multiplication = (double a, double b) -> a * b;
        MathOperation division = (double a, double b) -> a / b;


        double additionResult = executeOperation(3, 15, addition);
        System.out.println(additionResult);
        double subtractionResult = executeOperation(3, 15, subtraction);
        System.out.println(subtractionResult);
        double multiplicationResult = executeOperation(3, 15, multiplication);
        System.out.println(multiplicationResult);
        double divideResult = executeOperation(3, 15, division);
        System.out.println(divideResult);


    }


    static double executeOperation(double a, double b, MathOperation operation) {

        double result = operation.operate(a, b);

        return result;
    }
}
