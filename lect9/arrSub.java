// a array is given then find out the possible subsequence of that array so that sum of these element's array is equal to the valuw of k(user input)
// ex- arr[1,2,1]  , k=2
// possible subsequence is 1+1=2 and only 2

public class arrSub{
     
     static void find(int[] arr, int i, int sum, int k, String ans) {

        if (i == arr.length) {
            System.out.print(ans);

            if (sum == k)
                System.out.println(" -> Valid");
            else
                System.out.println(" -> Not Valid");

            return;
        }

        // Include
        find(arr, i + 1, sum + arr[i], k, ans + arr[i] + " ");

        // Exclude
        find(arr, i + 1, sum, k, ans);
    }
  
    

    public static void main(String[] args) {
         int[] arr = {1, 2, 1};
        int k = 2;

        find(arr, 0, 0, k, "");
    }
}