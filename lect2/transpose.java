package lect2;

import java.util.Scanner;
import java.util.Arrays;

public static Main{
    public static void main(String[] args){



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];

        }
        System.out.println(sum);

        //takke a new arr 
        int[][] transpose new int[n][m];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
               transpose[j][i]= arr[i][j] ;
            }
        }
        //print transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(traspose[i][j] + " ");
            }
        }
    }
}