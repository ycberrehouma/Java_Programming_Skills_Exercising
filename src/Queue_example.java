import java.util.*;


public class Queue_example {


    public static void main(String[] arg) {

        Queue<String> queue = new LinkedList<String>();
        Queue<Integer> numbers = new LinkedList<Integer>();



        queue.add("test");
        queue.add("toust");
        queue.add("tist");
        queue.add("tay");

        numbers.add(2);
        numbers.add(3);


        System.out.println("this is our initial queue "+ queue);
        System.out.println("size "+queue.size());
        System.out.println("peek is "+queue.peek());
        System.out.println("peek first "+((LinkedList<String>) queue).peekFirst());
        System.out.println("peek last "+((LinkedList<String>) queue).peekLast());
        System.out.println("queue" +queue);
        System.out.println("remove second one " +((LinkedList<String>) queue).remove(3));
        System.out.println("queue" +queue);
        System.out.println("remove function which will remove the peek " +queue.remove());
        System.out.println("our queue now is " +queue);
        System.out.println("if null element function will let us know else return tail " +queue.element());
        System.out.println("see if that changed anything in our queue" +queue);
        System.out.println("remove and return head " +queue.poll());
        System.out.println("Our queue now is" +queue);
        System.out.println("Our queue number  is" +numbers.peek() + ((LinkedList<Integer>) numbers).peekLast());





    }
}


