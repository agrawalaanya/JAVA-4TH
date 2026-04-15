//a string is given. find its substring through recursion

public class subStringRecur{

    static int subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return -1;
        }

        char ch= up.charAt(0);

        //include
        subset(p + ch, up.substring(1));

        //exclude
         subset(p , up.substring(1));
         return 0;
    }
    public static void main(String[] args) {
        String str= "ab";
        subset("" , str);
       // System.out.println(str.substring(0, str.length() ) );
    }
}