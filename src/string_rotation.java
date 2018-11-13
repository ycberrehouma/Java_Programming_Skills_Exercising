import java.util.*;
public class string_rotation {

   static String isSubstring(String s1,String s2) {
       String a = "";
       String b = "";
       String result;
       Boolean True=true;
       if (s1.length() != s2.length()) {
           System.out.println("Length different");
       } else {
           int x = 0;


           for (int i = 0; i < s1.length(); i++) {
               for (int j = 0; i < s1.length(); i++) {
                   if (s1.charAt(i) == s2.charAt(j) && i < s1.length()-1) {
                       if ( s1.charAt(i + 1) == s2.charAt(j + 1)) {
                           x = j;
                           break;
                       } else {
                           System.out.print("No");
                       }
                   }
               }
           }
           for (int i = x; i < s1.length(); i++) {
               a = a + s2.charAt(i) ;
           }
           for (int i = 0; i < x; i++) {
               b = b + s2.charAt(i) ;
           }
       }
       result = b;
       return result;
   }
    public static void main(String[] arg){


        String s1="waterbottle";
        String s2="erbottlewat";
        System.out.println(isSubstring(s1,s2));

    }
}
