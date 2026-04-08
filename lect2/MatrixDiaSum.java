package lect2;

import java.util.Scanner;

public class MatrixDiaSum{
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
    }
       
}
