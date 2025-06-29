import java.util.*;

public class SortUserInputLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();

        // Taking input from user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Before Sorting: " + numbers);

        // Sorting the LinkedList
        Collections.sort(numbers);

        System.out.println("After Sorting: " + numbers);
    }
}
