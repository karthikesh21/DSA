// Given a set of coin denominations and a target sum, find how many different combinations of coins can be used to achieve the target sum. Each coin denomination can be used an unlimited number of times.
// For example, if the denominations are {1, 2, 3} and the target sum is 4, the possible combinations are:
// {1, 1, 1, 1} {1, 1, 2} {2, 2} {1, 3}
// The total number of ways is 4.
// Sample Input 
// 3 4
// 1 2 3
// Sample Output 
// 4
// Explanation 
// The combinations are {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, and {1, 3}.

import java.util.*;

public class Main {

    public static int coin(int[] arr, int n, int sum) {
        if (sum == 0) {
            return 1;
        }
        if (n <= 0 || sum < 0) {
            return 0;
        }
        return coin(arr, n, sum - arr[n - 1]) + coin(arr, n - 1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(coin(a, n, k));
    }
}
