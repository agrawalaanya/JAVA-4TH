public class string{
    public static void main(String[] args) {
        
        String str1 = "hello";
        String str2 = new String("hiii");

        //print string
        System.out.println(str1);
        System.out.println(str2);

        //find length
        System.out.println(str1.length() + "is length of string 1");

        //substring
        System.out.println(str1.substring(0, 2));

        //replace some letter
        System.out.println(str1.replace('l', 'z'));

        //uppercase and lowercase
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        //char print
        System.out.println(str1.charAt(2) + " is the char of index 2");

        //check string equal
        System.out.println(str1.equals(str2));

        //check what string's contain
        System.out.println(str1.contains("World"));

        //print reverse of a string

        String rev= " ";
        for (int i = str1.length() -1 ; i>=0; i--) {
            rev = rev + str1.charAt(i);

        }
        System.out.println(rev + " -it is the reverse of str");

        //check palindrome

        if (str1.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println(" nott Palindrome");
        }





    }
}