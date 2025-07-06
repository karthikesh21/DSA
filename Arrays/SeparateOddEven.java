import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        boolean hasOdd = false, hasEven = false;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                hasOdd = true;
            }
        }

        if (!hasOdd)
            System.out.print("No odd elements");

        System.out.println();

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                hasEven = true;
            }
        }

        if (!hasEven)
            System.out.print("No even elements");

        sc.close();
    }
}
