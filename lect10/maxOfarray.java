//find max sum of a given array. condition- values should not adjacent

import java.util.Arrays;
public class maxOfarray{

    static int max(int[] arr, int i ,int[] dp){
        if(i >= arr.length){
            return 0;
         }

         //inclde
         int x =  arr[i] + max(arr, i+2, dp);
         int y =   max(arr, i+1, dp);

         dp[i] = Math.max(x,y);
         return dp[i];


    }
    public static void main(String[] args) {
        int[] arr= {2,1,4,9};
        int[] dp= new int[arr.length];

        Arrays.fill(dp, -1);
        System.out.println(max(arr, 0, dp ));
    }
}