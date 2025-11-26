
import java.io.*;

public class Switch {
    public static void main(String[] args) {
        System.out.println("--- MENU ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Usage: java ex5 <num1> <num2> <choice>");
        System.out.println("-----------------------------");

        if (args.length != 3) {
            System.out.println("Error: Please enter 3 arguments (num1 num2 choice).");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int ch = Integer.parseInt(args[2]);

        switch (ch) {
            case 1:
                int sum = a + b;
                System.out.println("Sum: " + sum);
                break;
            case 2:
                int diff = a - b;
                System.out.println("Difference: " + diff);
                break;
            case 3:
                int prod = a * b;
                System.out.println("Product: " + prod);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    int div = a / b;
                    System.out.println("Quotient: " + div);
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}

