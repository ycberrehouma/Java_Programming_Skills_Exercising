//Sort Stack with only one tmp stack exercise
import java.util.*;

public class sort_stack {
        static Stack sort(Stack<Integer> set){
            int v;
            Stack<Integer>tmp=new Stack<>();
            while(!set.isEmpty()){
                v=set.pop();
                while(!tmp.isEmpty() && tmp.peek()>v){
                    set.push(tmp.pop());
                }
                tmp.push(v);
            }
            System.out.println(tmp);
            return tmp;
        }
    public static void main(String[]arg){
        Stack<Integer> s=new Stack<>();

        s.add(4);
        s.add(5);
        s.add(8);
        s.add(11);
        s.add(3);
        s.add(1);
        s.add(2);

        System.out.println("unsorted"+s);
        System.out.println("----------");
        sort(s);
    }

}