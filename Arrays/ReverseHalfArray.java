import java.util.Scanner;

public class ReverseHalfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int mid = n / 2;

        for (int i = mid - 1; i >= 0; i--)
            System.out.print(a[i] + " ");

        for (int i = n - 1; i >= mid; i--)
            System.out.print(a[i] + " ");

        sc.close();
    }
}
