import java.util.*;

public class Stack_example {

    public static void main(String[] arg) {

        Stack<String> stack = new Stack<String>();

        stack.push( "test");
        stack.push( "tist");
        stack.push( "tost");
        stack.push( "yalla");

        System.out.println( "This is our initial stack  "+stack);
        System.out.println("This is the size our initial stack " +stack.size());
        System.out.println( "This is our peek " +stack.peek());
        System.out.println( "Remove peek " +stack.pop());
        System.out.println( "stack after removing peek " +stack);
        System.out.println( "get last element " +stack.lastElement());
        System.out.println( "get first element " +stack.firstElement());
        System.out.println( "check if empty " +stack.empty());
        System.out.println( "get element value at index 2 " +stack.elementAt(2));
        System.out.println( "get elemenet value at index 2 " +stack.get(2));
        System.out.println( "remove element of index 2 " +stack.remove(1));
        System.out.println( "print stack after remove " +stack);
        System.out.println( "this is our stack after remove with string as parameter " +stack);
    }
}
