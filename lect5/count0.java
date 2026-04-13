//take a integer which contain multiple zeros. count zeros using recursion

public class count0{
    
    static int countzero(int x){
        if(x==0){
            return 1;   
        }
        //return x%10 + count(x-1);

        int counts= (x%10==0) ? 1 : 0;
       
         return counts + countzero(x/10);
    }
    public static void main(String[] args) {
        int x= 1020304050;
        System.out.println(countzero(x));
    }
}