// You are given a matrix of dimensions (n1 x m1). Your task is to exchange the first column with the last column of the matrix.
// After performing the column exchange, print the modified matrix.
// Sample Input 
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 
// 3 2 1
// 6 5 4
// 9 8 7


import java.util.Scanner;

public class SwapFirstLastColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][m - 1];
            a[i][m - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
