public class StringPalindrome {
    public static void main(String[] args) throws Exception {

        java.io.BufferedReader input =
                new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String text = input.readLine();

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equalsIgnoreCase(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}