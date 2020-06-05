import java.util.*;

public class Solution {
 
            public static int[][] splitArray(int[] arrayToSplit, int chunkSize){
                if(chunkSize<=0){
                    return null;  // just in case :)
                }
                // first we have to check if the array can be split in multiple 
                // arrays of equal 'chunk' size
                int rest = arrayToSplit.length % chunkSize;  // if rest>0 then our last array will have less elements than the others 
                // then we check in how many arrays we can split our input array
                int chunks = arrayToSplit.length / chunkSize + (rest > 0 ? 1 : 0); // we may have to add an additional array for the 'rest'
                // now we know how many arrays we need and create our result array
                int[][] arrays = new int[chunks][];
                // we create our resulting arrays by copying the corresponding 
                // part from the input array. If we have a rest (rest>0), then
                // the last array will have less elements than the others. This 
                // needs to be handled separately, so we iterate 1 times less.
                for(int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++){
                    // this copies 'chunk' times 'chunkSize' elements into a new array
                    arrays[i] = Arrays.copyOfRange(arrayToSplit, i * chunkSize, i *                                chunkSize + chunkSize);
                }
                if(rest > 0){ // only when we have a rest
                    // we copy the remaining elements into the last chunk
                    arrays[chunks - 1] = Arrays.copyOfRange(arrayToSplit, (chunks - 1) *                        chunkSize, (chunks - 1) * chunkSize + rest);
                }
                return arrays; // that's it
            }

            public static void print2D(int mat[][]) //actually same as below but this is a function
    { 
        // Loop through all rows 
        for (int i = 0; i < mat.length; i++) 
  
            // Loop through all elements of current row 
            for (int j = 0; j < mat[i].length; j++) 
                System.out.print(mat[i][j] + " "); 
    } 
            

    public static void main(String args[]) 
    {  
        System.out.println("1st style of printing");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        //using a function
        System.out.println(Arrays.deepToString(splitArray(numbers,3)));
        
        System.out.println("2nd style of printing");
        //just to print elements for loop
        for (int[] x : splitArray(numbers,3))
            {
            for (int y : x)
            {
                    System.out.print(y + " ");
            }
            System.out.println();
            }
        System.out.println("3rd style of printing");
        // different syntax than previous but same approach
        int [][] splited = splitArray(numbers,3);
        
        for (int i = 0; i< splited.length; i++){
            for (int j = 0; j < splited[i].length; j++){
                System.out.print(splited[i][j]);
            }
            System.out.println();
        }
    }
 
}
