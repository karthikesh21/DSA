// // Given an integer array arr[]. Find the number of triangles that can be formed with three different array elements as lengths of three sides of the triangle.
// // A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.
// Sample Input 
// 4
// 4 6 3 7
// Sample Output 
// 3
// Explanation 
// There are three triangles possible [3, 4, 6], [4, 6, 7] and [3, 6, 7]. Note that [3, 4, 7] is not a possible triangle.



import java.util.Arrays;
import java.util.Scanner;

public class ValidTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;

        for (int i = n - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        System.out.println(count);
    }
}
