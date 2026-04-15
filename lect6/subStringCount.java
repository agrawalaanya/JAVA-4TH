//find substring then count through recuursion

public class subStringCount{

    static int subset(String str){
        if(str.isEmpty()){
           // System.out.println(p);
            return 1;
        }
        return subset(str.substring(1)) + subset(str.substring(1));
    }
    public static void main(String[] args) {
        String str= "ab";
       // subset("" , str);
        System.out.println(subset(str)) ;
    }
}