public class headTail{
    static void headtail(String str, int n){
        //base case...
        if(n==0){
            System.out.println(str);
            return ;
        }

        headtail(str + "H", n-1);
        headtail(str + "T", n-1);
    }
    public static void main(String[] args) {
        int n=2;
        headtail("" ,n);
    }
}