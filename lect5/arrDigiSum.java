//array is given. find its digit's sum

public class arrDigiSum{

    static int sumofdigiarr(int[] arr, int i ){
        if(i == arr.length){
            return 0;
        }
        return arr[i] + sumofdigiarr(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int i=0;

        System.out.println(sumofdigiarr(arr, i));

    }
}