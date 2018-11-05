import java.util.*;

public class Linked_list_example {

    public static void main (String[] arg){

        LinkedList<String> l = new LinkedList<String>();

        l.add("first");
        l.add("second");
        l.add("third");
        l.add("fourth");
        l.add("fifth");
        l.addFirst("Zero");
        l.addLast("hundred");
        l.add(3,"Hello");

        System.out.println("this is our initial linked list l "+l);
        System.out.println();
        System.out.println("this is the size of our linkded list l "+l.size() );
        System.out.println();
        System.out.println("get head element " +l.peek());
        System.out.println();
        System.out.println("get last element " +l.getLast());
        System.out.println();
        System.out.println("get first element " +l.getFirst());
        System.out.println();
        System.out.println("remove head with poll function " +l.poll());
        System.out.println("this is our linked list l after poll "+l);
        System.out.println();
        System.out.println("poll first " +l.pollFirst());
        System.out.println("this is our linked list l after poll first "+l);
        System.out.println();
        System.out.println("remove tail " +l.pollLast());
        System.out.println("this is our linked list l after poll last "+l);
        System.out.println();
        System.out.println("This is our head node " +l.peekFirst());
        System.out.println();
        System.out.println("this is our last node " +l.peekLast());
        System.out.println();
        System.out.println("returns head with element function " +l.element());
        System.out.println();
        System.out.println("pop head " +l.pop());
        System.out.println("linked after pop" +l);
        System.out.println();

        if(!l.isEmpty()) {
            System.out.println("remove element with value fourth from l " + l.remove("fourth"));
        }
        System.out.println("remove element with index 1 from l"+l.remove(1));
        System.out.println("our linked list after remove " +l);


        l.set(1,"World");
        System.out.println("our linkedlist after switching value of index 1 with world "+l);
    }
}
