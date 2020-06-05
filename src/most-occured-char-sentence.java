import java.util.*;

public  class Solution {

 static String max(String sentence){
 String p ="";
 sentence = sentence.replaceAll("[^a-zA-Z0-9]", " ");
 System.out.println(sentence);
 Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
 int max =0;
 for (int i = 0; i<sentence.length(); i++){
     if(sentence.charAt(i)!= ' '){
         if(h.get(sentence.charAt(i)) != null){
             
     h.put(sentence.charAt(i), h.get(sentence.charAt(i)) +1 );
     
         }else{
           h.put(sentence.charAt(i), 1 ) ; 
         }
         if (max < h.get(sentence.charAt(i)) ){
         max = h.get(sentence.charAt(i));
         p = String.valueOf(sentence.charAt(i));
     }
     }
 }

 System.out.println(h);
 return p;
 
 }
 
 //exception -
 //then sum
 
 
 public static void main(String args[]) 
  { 
System.out.println(max("hey, frieeeends! how is +life all goood?"));
    
 }
 }
