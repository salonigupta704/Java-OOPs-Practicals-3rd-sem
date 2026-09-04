public class FibonacciSeries {
    public static void main(String[] args) throws Exception {

        java.io.BufferedReader input =
                new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in));

        System.out.print("Enter number of terms: ");
        int terms = Integer.parseInt(input.readLine());

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}