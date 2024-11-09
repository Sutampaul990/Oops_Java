public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++; // increment of size of the list ....
        }
    }

    // Add - first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // insert middle
    public void insertMiddle(int data, int pos) {
        Node newNode = new Node(data);
        Node cur = head;
        int cnt = 1;
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        while (cnt < pos - 1) {
            cur = cur.next;
            cnt++;
        }
        Node temp = cur.next;
        cur.next = newNode;
        newNode.next = temp;
    }

    // Add - last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Delete first
    public void deleteFirst() {
        if(head == null){
            System.out.println("Linked list is empty ....");
            return;
        }
        System.out.println(head.data + " deleted successfully...");
        size--;
        head = head.next;
    }

    // Delete Last
    public void deleteLast() {
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty ....");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            System.out.println("List is empty");
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println(temp.next.data + " deleted successfully...");
        
        temp.next = null;
    }

    // print List
    public void printList() {
        if(head == null){
            System.out.println("Linked list is empty ....");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        // Insert
        list.addFirst(10);
        list.addFirst(20);
        list.printList();
        list.addLast(30);
        list.printList();
        list.addFirst(5);
        list.printList();
        list.insertMiddle(15, 4);
        list.printList();
        // Delete
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println("Size of the Linked list : " +list.getSize());
        list.addFirst(1);
        list.printList();
        System.out.println("Size of the Linked list : " + list.getSize());
    }
}
