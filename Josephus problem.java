// A total of n people are standing in a circle, and you are one of them playing a game. Starting from a person, k persons will be counted in order along the circle, and the kth person will be killed. Then the next k persons will be counted along the circle, and again the kth person will be killed. This cycle will continue until only a single person is left in the circle.
// If there are 5 people in the circle in the order A, B, C, D, and E, you will choose k=3. Starting from A, you will count A, B and C. C will be the 3rd person and will be killed. Then you will continue counting from D, E and then A. A will be third person and will be killed.
// You will be given an array where the first element is the first person from whom the counting will start and the subsequent order of the people. You want to be the last one standing. Determine the index at which you should stand to survive the game. Return an integer denoting safe position.
// Sample Input 
// 7 3
// Sample Output 
// 4
// Explanation 
// The sequence of eliminations is as follows:
// 1, 2, 3, 4, 5, 6, 7 → 1, 2, 4, 5, 6, 7
// 1, 2, 4, 5, 6, 7 → 1, 2, 4, 6, 7
// 1, 2, 4, 6, 7 → 1, 2, 4, 6
// 1, 2, 4, 6 → 1, 4, 6
// 1, 4, 6 → 1, 4
// 1, 4 → 4

import java.util.Scanner;

public class JosephusProblem {
    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(jos(a, b) + 1);
        scanner.close();
    }
}
