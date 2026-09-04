public class NumberPalindrome {
    public static void main(String[] args) throws Exception {

        java.io.BufferedReader input =
                new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(input.readLine());

        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}