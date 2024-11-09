import java.util.*;

public class LL_Collections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(10);
        list.addFirst(20);
        System.out.println(list);

        list.addLast(30);
        System.out.println(list);

        list.add(50);
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            // For Searching
            // if(list.get(i) == value) System.out.println("List is present...");
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");
        /*
         * list.removeFirst();
         * System.out.println(list);
         * list.removeLast();
         * System.out.println(list);
         */

         list.remove(2);
         System.out.println(list);

    }
}
