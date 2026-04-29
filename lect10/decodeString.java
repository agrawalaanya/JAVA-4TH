// decode the string from no. of alphatbet
// i/p- str-123
// o/p-  abc

import java.util.Arrays;
public class decodeString{

    static int decode(String str, int i, int[] dp) {

        if(i== str.length()){
            return 1;
        }

        if(str== "0"){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int one = decode(str, i+1, dp);
        int two = 0;

        if(i+1 < str.length()){
            int num= (str.charAt(i)- '0' + (str.charAt(i+1)- '0'));
            if(num<=20){
                two= decode(str, i+2, dp);
            }
        }
        return dp[i] = one+ two;
        
    }
     public static void main(String[] args) {
         String str= "12";

         int[] dp = new int[str.length()];
         Arrays.fill(dp, -1);

         int i=0;
         System.out.println(decode(str,i,dp));
     }
}
