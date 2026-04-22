//wap to print substring of k no.(integer value) in the given string

//ek string he...if k ki value 2 h too us string se sirf 2substring print honge

public class kInteger{

    static void totalString(String p, String str, int k){
        if(p.length()==k){
            System.out.println(p);
            return;
        }

        if(str.isEmpty()){
            return;
        }
        char ch= str.charAt(0);
        totalString(p+ ch, str.substring(1), k);    //add
        totalString(p, str.substring(1), k);    //skip
    }

    public static void main(String[] args) {
        String str= "abc";
        int k=2;
        String p= "";  //empty bcz isme ans add krte jyege
        totalString(p, str, k);

    }

}