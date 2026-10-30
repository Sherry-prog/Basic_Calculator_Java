import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    static double add(double a, double b)      { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }

    static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot take modulus by zero.");
        }
        return a % b;
    }

    static double power(double a, double b) { return Math.pow(a, b); }

    static void printMenu() {
        System.out.println("\n===== Console Calculator =====");
        System.out.println("1. Addition       (+)");
        System.out.println("2. Subtraction    (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division       (/)");
        System.out.println("5. Modulus        (%)");
        System.out.println("6. Power          (^)");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    static double readNumber(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number. Please try again.");
                sc.next(); // discard bad input
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number from the menu.");
                sc.next();
                continue;
            }

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid option. Choose between 0 and 6.");
                continue;
            }

            double a = readNumber(sc, "Enter first number: ");
            double b = readNumber(sc, "Enter second number: ");

            try {
                double result;
                String symbol;
                switch (choice) {
                    case 1:  result = add(a, b);      symbol = "+"; break;
                    case 2:  result = subtract(a, b); symbol = "-"; break;
                    case 3:  result = multiply(a, b); symbol = "*"; break;
                    case 4:  result = divide(a, b);   symbol = "/"; break;
                    case 5:  result = modulus(a, b);  symbol = "%"; break;
                    default: result = power(a, b);    symbol = "^"; break;
                }
                System.out.println("Result: " + a + " " + symbol + " " + b + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
