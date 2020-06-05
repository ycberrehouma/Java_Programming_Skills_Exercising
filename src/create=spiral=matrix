// Java program to print a n x n spiral matrix 
// in clockwise direction using O(1) space 
  
import java.io.*; 
import java.util.*; 
  
class Solution { 
  
    // Prints spiral matrix of size n x n  
    // containing numbers from 1 to n x n 
    static void printSpiral(int n) 
    { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                  
                // x stores the layer in which (i, j)th 
                // element lies 
                int x; 
  
                // Finds minimum of four inputs 
                x = Math.min(Math.min(i, j),  
                    Math.min(n - 1 - i, n - 1 - j)); 
  
                // For upper right half 
                if (i <= j) 
                    System.out.print((n - 2 * x) * (n - 2 * x) -  
                                     (i - x) - (j - x) + "\t"); 
  
                // for lower left half 
                else
                    System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) + 
                                     (i - x) + (j - x) + "\t"); 
            } 
            System.out.println(); 
        } 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 5; 
  
        // print a n x n spiral matrix in O(1) space 
        printSpiral(n); 
    } 
} 
