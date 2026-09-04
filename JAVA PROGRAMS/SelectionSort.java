import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            
            int[] a = new int[n];
            
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            for (int i = 0; i < n - 1; i++) {
                int min = i;
                
                for (int j = i + 1; j < n; j++) {
                    if (a[j] < a[min])
                        min = j;
                }
                
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
            
            System.out.println("Array after Selection Sort:");
            for (int i : a)
                System.out.print(i + " ");
        }
    }
}