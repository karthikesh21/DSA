import java.util.Scanner;

public class EvenDigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                int num = Math.abs(a[i]);
                int prod = 1;
                if (num == 0) prod = 0;
                while (num > 0) {
                    prod *= (num % 10);
                    num /= 10;
                }
                System.out.print(prod + " ");
                found = true;
            }
        }

        if (!found)
            System.out.println("No Even Elements");

        sc.close();
    }
}
