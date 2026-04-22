//wap to divide a string in two equal part if it is divide the print true else false

public class stringDiv {

    static boolean check(String str, int i, int mid) {

        if (i == mid){
            return true;
        }

        if (str.charAt(i) != str.charAt(i + mid)) return false;

        return check(str, i + 1, mid);
    }

    public static void main(String[] args) {

        String str = "abab";

        if (str.length() % 2 != 0) {
            System.out.println(false);
        } else {
            int mid = str.length() / 2;
            System.out.println(check(str, 0, mid));
        }
    }
}