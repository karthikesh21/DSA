// Given an array arr[] of N positive integers and a number K. The task is to find the kth smallest element in the array.
// Sample Input 
// 6 3
// 7 10 4 3 20 15
// Sample Output 
// 7
// Explanation 
// The sorted array is [3, 4, 7, 10, 15, 20]. The 3rd smallest element is 7.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println(a[k - 1]);
    }
}
