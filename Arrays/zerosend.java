import java.util.*;
public class zerosend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                System.out.print("0 ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        
    }
}
