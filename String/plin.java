package String;

public class plin {

    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                // not palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noo";
        System.out.println(ispalindrome(str));

    }

}
