//we have n no. of ladder. we take take 1 or 2 step forward at a time. count how many ways apn usme chadh skte h

public class ladder {

    static int ways(int n){
        //base case..
        if(n == 0 || n == 1)
            return 1;

        //recursion case...
        return ways(n-1) + ways(n-2);
    }

    public static void main(String[] args){

        int n = 4;
        System.out.println(ways(n));
    }
}
