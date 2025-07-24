import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Top half
        for (int i = 0; i < n; i++) {
            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 2; i >= 0; i--) {
            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
