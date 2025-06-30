import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n <= 5) {
            System.out.println("None");
        } else {
            for (int i = 1; i <= n; i++) {
                int k = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        k += j;
                    }
                }
                if (k == i) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
