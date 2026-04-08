//2 words are different with same alphabet

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        
        String str1 = "listen";
        String str2 = "silent";

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
        }
        else{
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if(Arrays.equals(a, b)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}