// // Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
// // Note:- The position you return should be according to 1-based indexing.
// Sample Input 
// 7
// 1 5 3 4 3 5 6
// Sample Output 
// 2
// Explanation 
// 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.


import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] == a[j]) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
