//convert two sting into integer and multiply them

public class strToInt{
    public static void main(String[] args) {
        String str1= "12";
        String str2= "1";

        int n1= 0;
        int n2= 0;

        for (int i = 0; i < str1.length(); i++) {
            n1= n1*10+ (str1.charAt(i) - '0');
        }
        for (int i = 0; i < str2.length(); i++) {
            n2= n2*10+ (str2.charAt(i) - '0');
        }
        System.out.println(n1 * n2);

    }
}