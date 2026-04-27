public class count {

    // Function to count subsequences whose sum = k
    static int count(int[] arr, int i, int sum, int k) {

        // Base case
        if (i == arr.length) {
            if (sum == k)
                return 1;   // valid subsequence
            else
                return 0;   // not valid
        }

        // Include current element
        int include = count(arr, i + 1, sum + arr[i], k);

        // Exclude current element
        int exclude = count(arr, i + 1, sum, k);

        // Total count
        return include + exclude;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int k = 2;

        int result = count(arr, 0, 0, k);

        System.out.println("Count of subsequences = " + result);
    }
}