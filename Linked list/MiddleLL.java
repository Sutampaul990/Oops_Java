class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleLL {

    static void display(Node head) {
        if (head == null)
            return;
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "\t");
            cur = cur.next;
        }
    }

    static Node reverseLL(Node head) {
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

    static void middle(Node head){
        if(head == null) return;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(15);
        Node n2 = new Node(20);
        Node n3 = new Node(25);
        Node n4 = new Node(30);
        Node n5 = new Node(35);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println("Linked list : ");
        display(head);
        /*
         * System.out.println("After reversing Linked list : ");
         * head = reverseLL(head);
         * display(head);
         * 
         */
        System.out.println();
        System.out.print("Middle of the Linked list : ");
        middle(head);
    }
}
