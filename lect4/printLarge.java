//make a string combination of numbers and alphabet. print largest no. among them

public class printLarge{
    public static void main(String[] args) {
        String str1 = "a1b2c3j5m9";
        char max = '0';

        for(int i=0; i<str1.length(); i++){
            char ch= str1.charAt(i);      //store string into a char array

             if(ch>= '0' && ch<= '9' && ch> max){
                 max= ch;
             }
        }
         System.out.println(max);
    }
}