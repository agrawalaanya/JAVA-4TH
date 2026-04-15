//print n no. of fabon. series using recursion 

public class faboSeries{
    static int fabo(int n){
        //base case...
        if(n==0 || n==1){    //or we can write as (n<=1) 
            return n;
        }
        //  else if(n==1){
        //     return 1;
        // }
        // else{

        // }

        //recursion caseee....
        return fabo(n-1) + fabo(n-2);

    }
    public static void main(String[] args){
        int n=10;

        for(int i=0; i<n ; i++){
            System.out.println(fabo(i) + " ");
        }
    }
}