//make a string.. remove consecutive words
//ip-- aabbbccddaaeefff
//op-- abcdaef

public class remConsecutive{
    public static void main(String[] args) {
        String str1= "aabbcccdeeff";
        String result= "";

        for(int i=0; i<str1.length(); i++){
            if(i==0 || str1.charAt(i)!= str1.charAt(i-1)){
                result += str1.charAt(i);
            }
        }
        System.out.println(result);

    }
}