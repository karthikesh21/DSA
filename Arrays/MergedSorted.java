import java.util.*;

public class MergedSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array (m):");
        int m = sc.nextInt();
        System.out.println("Enter the number of elements in the second array (n):");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the first array (m elements):");
        int[] nums1 = new int[m + n];
        System.out.println("Enter the elements of the second array (n elements):");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        System.out.println("Merged and sorted array:");
        Arrays.sort(nums1);
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
