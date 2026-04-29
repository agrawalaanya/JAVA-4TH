//int n is given, we have to move n step only by 1 and 2 steps ahead
// ex- n= 4
    
//     1111
//     112
//     211
//     121
//     22
//   ans= 5  


import java.util.Arrays;
public class move{

    static int moves(int n, int[] dp){
         if(n==0 ){
            return 1;
         }
         if(n<0 ){
            return 0;
         }
         if(dp[n] != -1){
            return dp[n];

        }
         //return moves(n - 1) + moves(n - 2);
         dp[n] = moves(n - 1, dp) + moves(n - 2, dp);

        return dp[n];

    }
    public static void main(String[] args) {
        int n= 3;
        int[] dp= new int[n+1]; 
         Arrays.fill(dp, -1);
        System.out.println(moves( n , dp));
    }
}