public class ArmstrongNumber {
    public static void main(String[] args) throws Exception {

        java.io.BufferedReader input =
                new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(input.readLine());

        if (number < 0) {
            System.out.println("Negative numbers are not Armstrong numbers.");
            return;
        }

        int originalNumber = number;
        int temporary = number;
        int digits = 0;

        if (number == 0) {
            digits = 1;
        } else {
            while (temporary != 0) {
                digits++;
                temporary = temporary / 10;
            }
        }

        temporary = number;
        int sum = 0;

        while (temporary != 0) {
            int digit = temporary % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temporary = temporary / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}