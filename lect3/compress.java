//i/p-- aabbcccd
//o/p-- a2b2c3d1

public class compress {
    public static void main(String[] args) {

        String str1 = "programming";
        String result = "";
        int count = 1;

        for (int i = 0; i < str1.length()-1; i++) {

            // Compare current character with next character
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                count++;
            } else {
                result = result + str1.charAt(i) + count;
                count = 1;
            }
        }

        // Add last character
        result = result + str1.charAt(str1.length() - 1) + count;

        System.out.println(result);
    }
}