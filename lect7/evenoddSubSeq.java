public class evenoddSubSeq{

    static void totalsum(int[] arr, int i, int sum) {
        if(i==arr.length){
            if(sum%2==0){
               System.out.println(sum + "even");
            }
            else{
                System.out.println(sum + "odd");
            }
            return;
        }

        totalsum(arr, i+1 , sum+arr[i]);
        totalsum(arr, i+1, sum);
        
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        totalsum(arr, 0,0);
    }
}