public class FactorialRecursion {

    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) throws Exception {

        java.io.BufferedReader input =
                new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(input.readLine());

        if (number < 0) {
            System.out.println("Factorial is not possible for negative numbers.");
        } else {
            System.out.println(
                    "Factorial = " + factorial(number));
        }
    }
}