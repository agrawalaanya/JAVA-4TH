//i/p matrix - 123 456 789
//o/p matrix - 147 258 369

//concept- 1. traverse col 2. even col-- top to bottom 3. odd col-- bottom to top

public class wave{
    public static void main(String[] args) {
        int arr[][]= {
          {1,2,3},
          {4,5,6},
          {7,8,9}
        }; 

        int row= arr.length;
        int column= arr[0].length;

        for(int j=0; j<column; j++){
            if(j % 2 == 0){
                //top to bottom
                for(int i=0; i<row; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                //bottom to top
                for(int i= row-1; i>=0; i--){
                     System.out.print(arr[i][j] + " ");
                }
            }
        }


    }
}