public class multiSubseq{
    static int totalsum(int[] arr, int i, int p, int k){
        if(i==arr.length){
            if(p<k && p!=1){
                return 1;
            }
            return 0;
        }

        int x= totalsum(arr, i+1, p+arr[i], k);
        int y= totalsum(arr, i+1, p  , k);

        return x+y;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int k=4;
        int ans= totalsum(arr, 0, 1, k);

        System.out.println(ans);
    }
}