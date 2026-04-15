public class binaryString{
    static void binarystring(String str, int n){
        //base case...
        if(n==0){
            System.out.println(str);
            return ;
        }

        binarystring(str + "0", n-1);
        binarystring(str + "1", n-1);
    }
    public static void main(String[] args) {
        int n=2;
        binarystring("" ,n);
    }
}