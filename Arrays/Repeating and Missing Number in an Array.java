// Find the Repeating and Missing Number in an Array Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, N} is missing and one number 'B' occurs twice in array. Find these two numbers.
// Sample Input 
// 2
// 2 2
// Sample Output 
// 2 1  

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] freq = new int[n + 1];
        int repeat = -1, missing = -1;
        for (int i = 0; i < n; i++)
            freq[arr[i]]++;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) missing = i;
            if (freq[i] == 2) repeat = i;
        }
        System.out.println(repeat + " " + missing);
    }
}
