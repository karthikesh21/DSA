import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 100, nat = 0, k = 0;
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            nat += i;
        }

        for (int i = 0; i < n; i++) {
            k += a[i];
        }

        System.out.println(nat - k);
        sc.close();
    }
}
