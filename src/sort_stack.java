//Sort Stack with only one tmp stack exercise 
import java.util.*;

public class sort_stack {

    public static Stack<Integer> Sort(Stack<Integer> stack) {


        Stack<Integer> tmp = new Stack<>();
        while (!stack.isEmpty()) {
            int v = stack.pop();
            while (!tmp.isEmpty() && v <tmp.peek()){
                stack.push(tmp.pop());
            }
            tmp.push(v);
        }

        System.out.println(tmp);
        return tmp;

    }
    public static void main(String[]arg){
        Stack<Integer> s= new Stack<>();

        s.add(10);
        s.add(50);
        s.add(3);
        s.add(40);
        s.add(99);
        s.add(69);
        s.add(4);

        System.out.println("This is our initial stack order"+s);
        System.out.println("-----");
        System.out.println("This is our stack order after applying the sort");
        Sort(s);
    }

}
