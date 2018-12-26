// aabcccccaaa would become a2blc5a3


public class string_compression {

    static String anagram(String s) {
        int count = 1;
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if ( i<s.length()-1 && (s.charAt(i) == s.charAt(i + 1))) {
                count++;
            }
            else if ( i<s.length()-1 && s.charAt(i)!= s.charAt(i+1) && count==1){
                tmp = tmp+s.charAt(i)+"1";
            }
            else {
                String num = Integer.toString(count);
                tmp = tmp+ s.charAt(i) + num;
                count = 1;
            }
        }
        System.out.println(tmp);
        return tmp;

    }


    public static void main(String[] arg) {
        String s = "aabcccccaaa";
        anagram(s);

    }
}

