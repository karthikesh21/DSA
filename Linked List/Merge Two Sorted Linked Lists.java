import java.util.Scanner;

class Node { 
    int data; 
    Node next; 
    Node(int d) { data = d; } 
}

public class MergeSortedLists {
    static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.data < b.data) { a.next = merge(a.next, b); return a; }
        else { b.next = merge(a, b.next); return b; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first sorted list: ");
        int n1 = sc.nextInt();
        Node a = null, tailA = null;
        System.out.println("Enter elements:");
        for (int i = 0; i < n1; i++) {
            Node newNode = new Node(sc.nextInt());
            if (a == null) a = tailA = newNode;
            else { tailA.next = newNode; tailA = newNode; }
        }

        System.out.print("Enter size of second sorted list: ");
        int n2 = sc.nextInt();
        Node b = null, tailB = null;
        System.out.println("Enter elements:");
        for (int i = 0; i < n2; i++) {
            Node newNode = new Node(sc.nextInt());
            if (b == null) b = tailB = newNode;
            else { tailB.next = newNode; tailB = newNode; }
        }

        Node result = merge(a, b);
        System.out.print("Merged list: ");
        while (result != null) { 
            System.out.print(result.data + " "); 
            result = result.next; 
        }
    }
}
