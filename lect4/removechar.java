//make a string and remove first alphabet from it

public class removechar{
    public static void main(String[] args) {
        String str= "heello";
        char remove = 'h';

        String result= "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!= remove){
                result += str.charAt(i);
            }
        }
        System.out.println(result);


    }
}