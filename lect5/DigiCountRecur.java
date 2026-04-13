//wap to find count of digit using recursion

public class DigiCountRecur{
    //static int counts=0;
    static int count(int x){
        if(x==0){
          // return counts;
          return 0;

        }
        return 1 + count(x/10); 
    }
    public static void main(String[] args) {
        int x= 123;
        System.out.println(count(x));
    }
}