//check if a string contain only number return true else false

public class allNum{
    public static void main(String[] args) {
        String str= "heyyyy";
        boolean flag= true;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)< '0' ||str.charAt(i)> '9' ){
                flag= false;
                break;
            }
        }
        System.out.println(flag);

    }
}