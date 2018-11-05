import java.util.*;

public class Hash_Dict {

    public static void main(String[] arg) {
        //creating a hash table
        HashMap dictionary = new HashMap();

        dictionary.put(1, "hello");
        dictionary.put(2,"ole");
        dictionary.put(3,"ok");
        dictionary.put(4,"let's go");
        dictionary.put(5,"are you ready?");
        dictionary.put(6,"yes i am ");


        System.out.println("values in dictionary: " + dictionary.get(3));
        System.out.println(dictionary);

        if (dictionary.containsValue("ok")){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

        for (int i=1; i<dictionary.size();i++){

            if ( dictionary.get( i ).equals( "are you ready?" ) )
            {
                System.out.println("i got you");
                dictionary.remove(5);
                System.out.println(dictionary);
            }
            else{
                System.out.println("sorry not today");

            }


        }



        // clear hash table h
        dictionary.clear();

        // checking hash table h
        System.out.println("after clearing: " + dictionary);
    }
}
