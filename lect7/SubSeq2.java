//find sub sequence of a array than find one by one is it palindrome or not

public class SubSeq2{

    static int subseq(String p, String up){

        if(up.isEmpty()){
            if(!p.isEmpty()){
                String rev =new StringBuilder(p).reverse().toString();

                if(p.equals(rev)){
                System.out.println(p + "- palindrome");
            }
            else{
                 System.out.println(p + "- Not palindrome");
            }
            }
           
            return 0 ;
        }

        char ch = up.charAt(0);

        subseq(p+ ch, up.substring(1));
        subseq(p    , up.substring(1));

        return 0;

    }

    public static void main(String[] args) {
        String str= "aba";
        subseq("",str);
    }
}