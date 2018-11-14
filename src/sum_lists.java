import java.math.*;

import java.util.*;
import java.util.LinkedList;
public class sum_lists {

    static int sumlist(LinkedList<Integer> l1, LinkedList<Integer> l2){
        int n1=0;
        int n2=0;
        int size=l1.size();

        for (int i=size-1;i>=0;i--){
            n1=n1+l1.pop()*(int)Math.pow(10,i);
            n2=n2+l2.pop()*(int)Math.pow(10,i);
        }
     int sum=n1+n2;
     System.out.println(n1);
        System.out.println(n2);
     return sum;
    }
    public static void main(String[] arg){
        LinkedList<Integer>l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();

        l1.add(6);
        l1.add(1);
        l1.add(7);
        l2.add(2);
        l2.add(9);
        l2.add(5);

        System.out.println(sumlist(l1,l2));

    }
}
