import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        switch   (choice) {
            case 1 -> System.out.println("Addition = " + (a + b));

            case 2 -> System.out.println("Subtraction = " + (a - b));

            case 3 -> System.out.println("Multiplication = " + (a * b));

            case 4 -> System.out.println("Division = " + (a / b));

            default -> {
                System.out.println("Invalid choice");
                sc.close();
            }
        }
    }
}