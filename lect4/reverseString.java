public class reverseString{
    static void reverse(String str, int i){
        if(i<0){
            return;
        }
        System.out.print(str.charAt(i));
        reverse(str, i-1);
    }

    public static void main(String[] args){
      reverse("hello",4);
      
    }
}