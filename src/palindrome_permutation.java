import java.util.*;
public class palindrome_permutation {


    static void palindrome(String s){
        String tmp="";
        for(int i=s.length()-1;i>=0;i--){
            tmp=tmp+s.charAt(i);

        }

        if(tmp.equals(s)){
            System.out.println(tmp);
        }


    }
    public static void main(String[] arg){
        String s1="taat";
        palindrome(s1);

    }
}
