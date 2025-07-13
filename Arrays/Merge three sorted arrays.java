// Given three sorted arrays A, B and C of size N, M and P respectively. The task is to merge them into a single array which must be sorted in increasing order.
// Sample Input 
// 4 3 5
// 1 3 5 7
// 2 6 8
// 0 4 9 10 11
// Sample Output 
// 0 1 2 3 4 5 6 7 8 9 10 11
// Explanation 
// The arrays A = [1, 3, 5, 7], B = [2, 6, 8], and C = [0, 4, 9, 10, 11] are merged into a single sorted array [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11].


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[p];
        int[] merged = new int[n + m + p];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            merged[i] = a[i];
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            merged[n + i] = b[i];
        }

        for (int i = 0; i < p; i++) {
            c[i] = sc.nextInt();
            merged[n + m + i] = c[i];
        }

        Arrays.sort(merged);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
