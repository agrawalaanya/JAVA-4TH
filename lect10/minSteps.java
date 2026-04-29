// public class minSteps{

//     static int steps(int n, int ans) {
//         if(n>1){
//             return 0;
//         }
//         if(n>0){
//             return steps(n-1, ans);
//         }
//         return steps(n%2 , ans);
//         return steps(n%3, ans);
//         //return 0;
//     }
//     public static void main(String[] args) {
//        // int n= 10;
//        // int ans= 0;
//         System.out.println( steps(10, 0));
//     }
// }

import java.util.Arrays;
public class minSteps{

    static int minstep(int n, int[] dp){
        if(n==1){
             return 0;
        }
        if(dp[n] != -1){
            return dp[n];

        }
        int ans = minstep(n-1, dp);

        if(n%2==0){
            ans= Math.min(ans, minstep(n/2, dp));
        }

        if(n%3==0){
            ans= Math.min(ans, minstep(n/3, dp));
        }

        dp[n]=  1+ ans;
        return dp[n];
    }
    public static void main(String[] args) {
        int n=10;
        int[] dp= new int[n+1];

        Arrays.fill(dp, -1);
        System.out.println(minstep(n,dp));
    }
}