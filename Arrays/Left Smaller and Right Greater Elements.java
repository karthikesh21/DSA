// Find the Element with Left Smaller and Right Greater Elements
// Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it. Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.
// Sample Input 
// 4
// 4 2 5 7
// Sample Output 
// 5


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);

        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--)
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);

        int ans = -1;
        for (int i = 1; i < n - 1; i++) {
            if (leftMax[i] <= arr[i] && arr[i] <= rightMin[i]) {
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
