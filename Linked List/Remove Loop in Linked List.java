import java.util.*;

class Node { 
    int data; 
    Node next; 
    Node(int d) { data = d; } 
}

public class RemoveLoopLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // creates a loop

        Set<Node> set = new HashSet<>();
        Node prev = null, curr = head;
        while (curr != null) {
            if (!set.add(curr)) { prev.next = null; break; }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Loop removed!");
    }
}
