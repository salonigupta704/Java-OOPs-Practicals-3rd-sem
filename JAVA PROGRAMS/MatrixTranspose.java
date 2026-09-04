import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows and columns: ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int[][] a = new int[r][c];
            
            System.out.println("Enter matrix:");
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    a[i][j] = sc.nextInt();
            
            System.out.println("Transpose of matrix:");
            
            for (int j = 0; j < c; j++) {
                for (int i = 0; i < r; i++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    }
}