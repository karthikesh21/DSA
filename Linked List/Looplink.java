import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class kar {
    static boolean detectLoop(Node head) {
        HashSet<Node> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head))
                return true;
            visited.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String kar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the linked list: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(arr[i]);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("The elements of the linked list are: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.print("Enter the position to create a loop (0 for no loop): ");
        int pos = sc.nextInt();
        if (pos > 0) {
            Node loopNode = head;
            for (int i = 1; i < pos && loopNode != null; i++) {
                loopNode = loopNode.next;
            }
            if (loopNode != null) {
                tail.next = loopNode; 
            }
        }
        System.out.println("Loop created at position: " + pos);
        System.out.println("The linked list with potential loop is created.");

        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
        sc.close();
    }
}