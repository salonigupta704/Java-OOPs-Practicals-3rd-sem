public class InterestCalculator {
    public static void main(String[] args) throws Exception {

        java.io.BufferedReader input =
                new java.io.BufferedReader(
                        new java.io.InputStreamReader(System.in));

        System.out.print("Enter principal amount: ");
        double principal = Double.parseDouble(input.readLine());

        System.out.print("Enter rate of interest: ");
        double rate = Double.parseDouble(input.readLine());

        System.out.print("Enter time in years: ");
        double time = Double.parseDouble(input.readLine());

        // Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Compound Interest
        double amount = principal *
                Math.pow(1 + rate / 100, time);

        double compoundInterest = amount - principal;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Compound Interest = " + compoundInterest);
        System.out.println("Compound Amount = " + amount);
    }
}