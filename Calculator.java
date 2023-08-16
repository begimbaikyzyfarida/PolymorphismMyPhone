import java.util.Scanner;

public class Calculator {
    private double solution;
    private static double x;
    private static double y;

    public Calculator() {
        solution = 0;
    }

    public double addition(double x, double y) {
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        if (y != 0) {
            solution = x / y;
            return solution;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public void calc(int ops) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        x = scanner.nextDouble();
        System.out.print("Enter operand 2: ");
        y = scanner.nextDouble();

        switch (ops) {
            case 1:
                System.out.println("Result: " + addition(x, y));
                break;
            case 2:
                System.out.println("Result: " + subtraction(x, y));
                break;
            case 3:
                System.out.println("Result: " + multiplication(x, y));
                break;
            case 4:
                System.out.println("Result: " + division(x, y));
                break;
            default:
                System.out.println("Invalid operation choice.");
        }
    }
}
