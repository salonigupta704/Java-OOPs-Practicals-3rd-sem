import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalSort {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of strings: ");
            int n = sc.nextInt();
            
            sc.nextLine();
            
            String[] arr = new String[n];
            
            System.out.println("Enter the strings:");
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine();
            }
            
            Arrays.sort(arr);
            
            System.out.println("Strings in alphabetical order:");
            
            for (String str : arr) {
                System.out.println(str);
            }
        }
    }
}