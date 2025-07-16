// You are given an integer n and an integer array arr of size n+2. All elements of the array are in the range from 1 to n. Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers. Note: Return the numbers in their order of appearing twice. So, if x and y are repeating numbers, and x's second appearance comes before the second appearance of y, then the order should be (x, y).
// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(1).
// Sample Input 
// 5
// 1 2 3 4 5 4 2
// Sample Output 
// 4 2
// Explanation 
// The number 4 repeats first, followed by the number 2.  

import java.util.Scanner;

public class FindRepeatingWithoutMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int size = n + 2;
        int[] a = new int[size];
        int[] freq = new int[n + 1];  // Because numbers are from 1 to n

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (freq[a[i]] == 1) {
                System.out.print(a[i] + " ");
            } else {
                freq[a[i]] = 1;
            }
        }
    }
}
