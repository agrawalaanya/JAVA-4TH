//find sum of digits through recursion

public class SumOfDIgitRecur{
    static int sumofdigi(int x){
        if(x==0){
            return 0;
        }

        return x%10 + sumofdigi(x/10);
    }
    public static void main(String[] args) {
        int x= 12345;
        System.out.println(sumofdigi(x));
    }

}