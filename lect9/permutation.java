//find all permutation of a given string

public class permutation{

    static void permu(String str, String ans) {

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remaining string after removing chosen character
            String ros = str.substring(0, i) + str.substring(i + 1);

            permu(ros, ans + ch);

            
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        System.out.println("All permutations are: ");

        permu(str, "");
    }
}