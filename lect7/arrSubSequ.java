//find sum of array's subsequuence

public class arrSubSequ{

    static int finalsum(int[] arr, int i, int sum){

        if(i==arr.length){
            return sum;
        }

        int x= finalsum(arr, i+1, sum+ arr[i]);  //include
        int y= finalsum(arr, i+1, sum);          //exclude
        return x+y ;

    }

    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int i=0;
        int sum=0;
        System.out.println(finalsum(arr,i,sum));
    }
}