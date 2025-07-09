// You are given a rope of length n meters. You can cut the rope into pieces of lengths a, b, and c (where a, b, and c are positive integers) to maximize the number of pieces the rope can be cut into. Find the maximum number of pieces the rope can be cut into.
// Input Format
// The first line contains three integers n, a, b, and c separated by spaces
// Output Format
// Print the maximum number of pieces the rope can be cut into, or -1 if it is not possible to cut the rope into valid pieces.
// Sample Input 0
// 5 2 5 1
// Sample Output 0
// 5
// Explanation 0
// You can cut the rope into 5 pieces of length 1 (since n = 5 and each piece is of length 1).

import java.util.Scanner;

public class RopeCutting {

    public static int rope(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;

        int ropA = rope(n - a, a, b, c);
        int ropB = rope(n - b, a, b, c);
        int ropC = rope(n - c, a, b, c);

        int max = Math.max(ropA, Math.max(ropB, ropC));

        if (max == -1) return -1;

        return max + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(rope(n, a, b, c));
    }
}

