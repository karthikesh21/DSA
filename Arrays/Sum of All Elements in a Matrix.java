// You are given a matrix of size m x n. Your task is to calculate the sum of all the elements in the matrix.
//   Sample Input 
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 
// 45

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int sum = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += a[i][j];
            }
        }

        System.out.println(sum);
    }
}
