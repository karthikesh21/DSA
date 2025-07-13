// // You are given a matrix of size N x N. Your task is to print the elements of the matrix in a snake-like pattern. The snake pattern means you print the first row from left to right, the second row from right to left, the third row from left to right, and so on.
// Sample Input 
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 
// 1 2 3 6 5 4 7 8 9

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Zigzag row-wise printing
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
