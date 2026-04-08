//input- 123 456789
//output- 123 698745



// import java.til.Scanner;
// import java.til.Arrays;

public static spiralMatrix{
    public static void main(String[] args){
        int arr[][]= {
          {1,2,3},
          {4,5,6},
          {7,8,9}
        };    
          //four boundary condition

          int top=0;
          int bottom = arr.length -1;
          int left=0;
          int right = arr[0].length -1 ;

          //step1-- left to right
          while (top<=bottom && left<= right) {

            for (int i = left; i <=right; i++) {
                 System.out.print(arr[top][i] + " ");
            }
            top++;

            //strp2-- top to bottom
            for(int i= top; i<=bottom; i++){
                System.out.println(arr[i][right] + " ");
            }
            right--;

            //step3--right to left
            for(int i= right; i<=left; i--){
                System.out.println(arr[i][bottom] + " ");
            }
            bottom++;

            //step4-- bottom to top
            for(int i=bottom; i<=top; i++){
                System.out.println(arr[bottom][i]);

            }

              
          }
    }
}