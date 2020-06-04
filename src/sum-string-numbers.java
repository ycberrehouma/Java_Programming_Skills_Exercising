import java.util.*;

public  class Solution {

 static String sum(String num){
 //remove spaces
 int c =0;
 int sum=0;a

 while(c!=num.length()){
     
     if(num.charAt(c)!=' '){
        
         if(num.charAt(c)=='-'){
         sum = sum - (Integer.parseInt(String.valueOf(num.charAt(c+1))));
         c=c+1;
         }else {
            sum = sum + (Integer.parseInt(String.valueOf(num.charAt(c))));
            
         }

     }
      c++;

 }
 return Integer.toString(sum);
 //exception -
 //then sum
 }
 
 public static void main(String args[]) 
  { 
    System.out.println(sum("3 5 1 5 9"));
 }
 }
