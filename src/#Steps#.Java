import java.util.*;

public class Solution {

/* create a solution where for an entry 4, the output would be 
    #
    ##
    ###
    ####
    */
    static void printPatternRowRecur(int n) 
    { 
        // base condition 
        if (n < 1){
            return; 
        }
        
        System.out.print("#"); 
        printPatternRowRecur(n - 1); 
    } 
      
    static void printPatternRecur(int n) 
    { 
        // base condition 
        if (n < 1){
            return; 
        }
        // print the stars of the n-th row  
        printPatternRowRecur(n);  
          
        // move to next line 
        System.out.println (); 
          
        // print stars of the  
        // remaining rows recursively 
        printPatternRecur(n - 1); 
          
    }

    static void output(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void output2(int n){//opposite of desired
        if (n <1){
            return;
        }
            for (int i = 1; i<=n; i++){
                    System.out.print("#");
            }
            System.out.println();
            output2(n-1);
        
    }
  
    static void output3(int n, int row ){
        if (n==row){
            return;
        }
            for (int i = 0; i<=row; i++){
                    System.out.print("#");
            }
            System.out.println();
            output3(n, row+1);
        
    }
    // Driver program to test above 
    public static void main (String[] args)  
    { 
        int n = 6; 
        output3(n,0); 
          
    } 
} 
