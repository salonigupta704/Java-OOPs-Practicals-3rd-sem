import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            
            int[] a = new int[n];
            
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            System.out.print("Enter element to search: ");
            int key = sc.nextInt();
            
            int position = -1;
            
            for (int i = 0; i < n; i++) {
                if (a[i] == key) {
                    position = i + 1;
                    break;
                }
            }
            
            if (position != -1)
                System.out.println("Element found at position: " + position);
            else
                System.out.println("Element not found.");
        }
    }
}