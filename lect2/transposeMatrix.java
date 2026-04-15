// public static transposeMatrix{
//     public static void main(String[] args){



//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//         }
//         int sum=0;
//         for (int i = 0; i < n; i++) {
//             sum += arr[i][i];

//         }
//         System.out.println(sum);

//         //takke a new arr 
//         int[][] transpose new int[n][m];
//          for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++){
//                transpose[j][i]= arr[i][j] ;
//             }
//         }
//         //print transpose
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++){
//                 System.out.print(traspose[i][j] + " ");
//             }
//         }
//     }
// }

public class transposeMatrix {
    public static void main(String[] args) {

        // Original matrix
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int n = arr.length;        // rows
        int m = arr[0].length;     // columns

        // Print original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of diagonal (only works properly for square matrix)
        int sum = 0;
        for (int i = 0; i < Math.min(n, m); i++) {
            sum += arr[i][i];
        }
        System.out.println("Sum of diagonal elements: " + sum);

        // Create transpose matrix (note: size m x n)
        int[][] transpose = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print transpose matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}