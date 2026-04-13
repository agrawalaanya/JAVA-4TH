//take 2 integers x and n then find x^n through recursion

public class xOf_n{

    static int power(int x,int n){
            //base case-
            if(n==0){
                return 1;
            }
            return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x=3;
        int n=5;
        System.out.println(power(x,n));

    }
}