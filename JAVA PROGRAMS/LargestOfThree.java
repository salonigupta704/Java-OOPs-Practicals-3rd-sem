public class LargestOfThree {
    public static void main(String[] args) throws Exception {

        java.io.BufferedReader input =
                new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int firstNumber = Integer.parseInt(input.readLine());

        System.out.print("Enter second number: ");
        int secondNumber = Integer.parseInt(input.readLine());

        System.out.print("Enter third number: ");
        int thirdNumber = Integer.parseInt(input.readLine());

        int largest;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largest = firstNumber;
        } else if (secondNumber >= firstNumber &&
                   secondNumber >= thirdNumber) {
            largest = secondNumber;
        } else {
            largest = thirdNumber;
        }

        System.out.println("Largest number = " + largest);
    }
}