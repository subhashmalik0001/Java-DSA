package String;

public class campare {
    public static void main(String[] args) {
        String s1 = "tony";
        // String s2 = "tony";
        String s3 = new String("tony");

        // if (s1 == s2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are mot equal");
        // }
        // if (s1 == s3) {
        // System.out.println("str are equal");
        // } else {
        // System.out.println("Strings are mot equal");
        // }
        // we have a function to campare a strings
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are mot equal");

        }

    }
}
