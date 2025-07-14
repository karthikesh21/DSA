// Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.
// Sample Input 
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 
// 3 6 9
// 2 5 8
// 1 4 7

import java.util.Scanner;

public class MatrixColumnReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
