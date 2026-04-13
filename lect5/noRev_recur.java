//reverse a no. through recursion

public class noRev_recur{
    static int Rev=0;
    static int Rev(int x){
        if(x==0){
            return Rev;
        }
        //find last digit as n%10

    Rev = Rev * 10 + x%10;
        return Rev(x/10);

    }
    public static void main(String[] args) {
        int x= 12345;
        System.out.println(Rev(x));
    }
}