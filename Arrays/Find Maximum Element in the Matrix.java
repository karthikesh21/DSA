// Sample Input 
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 
// 9

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                max = Math.max(a[i][j], max);
            }
        }

        System.out.println(max);
    }
}
