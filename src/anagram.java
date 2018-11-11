import java.util.*;

public class anagram {


    // function to calculate minimum numbers
    // of characters to be removed to make
    // two strings anagram
    static int solution(String A, String B)
    {
        // make hash array for both string
        // and calculate frequency of each
        // character
        int count1[] = new int[26];
        int count2[] = new int[26];

        // count frequency of each character
        // in first string
        for (int i = 0; i < A.length() ; i++)
            count1[B.charAt(i) -'a']++;

        // count frequency of each character
        // in second string
        for (int i = 0; i < B.length() ; i++)
            count2[B.charAt(i) -'a']++;

        // traverse count arrays to find
        // number of characters to be added
        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] -
                    count2[i]);
        return result;
    }

    // Driver program to run the case
    public static void main(String[] args)
    {
        String A = "apple", B = "pear";
        System.out.println(solution(A, B));

    }
}
