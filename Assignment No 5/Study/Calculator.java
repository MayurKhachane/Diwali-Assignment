package Study;

public class Calculator {

    public static int calculate(int number1, int number2, String operator) throws InvalidOperatorException {
        switch (operator) {
            case "+": return number1 + number2;
            case "-": return number1 - number2;
            case "*": return number1 * number2;
            case "/":
                if (number2 == 0) throw new ArithmeticException("Division by zero is not allowed");
                return number1 / number2;
            case "%":
                if (number2 == 0) throw new ArithmeticException("Modulo by zero is not allowed");
                return number1 % number2;
            default:
                throw new InvalidOperatorException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Addition: " + calculate(10, 5, "+"));
            System.out.println("Division: " + calculate(10, 2, "/"));
            System.out.println("Invalid: " + calculate(5, 3, "#"));
        } catch (InvalidOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }
    }
}
