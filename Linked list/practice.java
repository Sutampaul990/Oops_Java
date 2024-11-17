import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class practice {

    static void printLL(Node head) {
        if (head == null)
            return;
        Node temp = head;
        System.out.print(temp.data + "\t");
        printLL(temp.next);
    }

    static Node insertBegin(Node head, int value) {
        Node temp = new Node(value);
        if (head == null)
            return temp;
        temp.next = head;
        return temp;
    }

    static Node insertEnd(Node head, int value) {
        Node temp = new Node(value);
        if (head == null)
            return null;

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = temp;
        return head;
    }

    static Node deleteFirst(Node head) {
        if (head == null || head.next == null)
            return null;
        return head.next;
    }

    static Node deleteLast(Node head) {
        if (head == null || head.next == null)
            return null;
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }

    static Node insertPosition(Node head, int pos, int value) {
        Node temp = new Node(value);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node cur = head;
        for (int i = 1; i <= pos - 2; i++) {
            cur = cur.next;
        }
        if (cur == null)
            return head;
        temp.next = cur.next;
        cur.next = temp;
        return head;
    }

    static int search(Node head, int ele) {
        int pos = 1;
        if (head == null)
            return 0;
        Node cur = head;
        while (cur != null) {
            if (cur.data == ele)
                return pos;
            else {
                cur = cur.next;
                pos += 1;
            }
        }
        return -1;
    }

    static int recursiveSearch(Node head, int ele) {
        if (head == null)
            return -1;
        if (head.data == ele)
            return 1;
        else {
            int res = search(head.next, ele);
            if (res == -1)
                return -1;
            else
                return res + 1;
        }
    }

    static Node reverseLL(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newHead = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static Node reverseLinkedList(Node head) {
        /*
         * // Using Stack
         * Node temp = head;
         * Stack<Integer> stack = new Stack<>();
         * while (temp != null) {
         * stack.push(temp.data);
         * temp = temp.next;
         * }
         * temp = head;
         * while (temp != null) {
         * temp.data = stack.pop();
         * temp = temp.next;
         * }
         * return head;
         */

        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * Node head = new Node(10);
         * Node n1 = new Node(20);
         * Node n2 = new Node(30);
         * Node n3 = new Node(40);
         * 
         * head.next = n1;
         * n1.next = n2;
         * n2.next = n3;
         * n3.next = null;
         * 
         * 
         * printLL(head);
         * System.out.println();
         * head = insertBegin(head, 5);
         * printLL(head);
         * 
         * System.out.println();
         * 
         * printLL(head);
         * System.out.println();
         * head = insertEnd(head, 50);
         * printLL(head);
         * 
         * System.out.println();
         * 
         * printLL(head);
         * System.out.println();
         * head = deleteFirst(head);
         * printLL(head);
         * 
         * System.out.println();
         * 
         * printLL(head);
         * System.out.println();
         * head = deleteLast(head);
         * printLL(head);
         * 
         * System.out.println();
         * 
         * printLL(head);
         * System.out.println();
         * head = insertPosition(head, 2, 15);
         * printLL(head);
         * 
         * System.out.println();
         * 
         * printLL(head);
         * System.out.println();
         * // int position = search(head,15);
         * int position = recursiveSearch(head, 40);
         * System.out.println(position);
         * 
         * System.out.println();
         * 
         */

        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        // Print the original linked list
        System.out.println("Original Linked List: ");
        printLL(head);

        // Reverse the linked list
        head = reverseLL(head);
        System.out.println();

        // Print the reversed linked list
        System.out.println("Reversed Linked List: ");
        printLL(head);

    }
}
