package String;

// import java.util.Scanner;

public class basic {
    public static void printletter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = {'a','b', 'c'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // String are IMMUTABLE

        // INOUT OR OUTPUT

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullname = "tony stark";
        // System.out.println(fullname.length());

        // concateantion means jodna
        String firstname = "subhash";
        String lastname = "malik";
        String fullname = firstname + " " + lastname;
        printletter(fullname);

    }

}
