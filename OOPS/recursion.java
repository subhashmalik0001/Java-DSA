package OOPS;

public class recursion {
    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;

        }
        System.out.println(n + " ");
        printdec(n - 1);

    }

    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printinc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;

        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;

        return fn;

    }

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);

        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isshorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isshorted(arr, i + 1);
    }

    public static int firstoccure(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccure(arr, key, i + 1);
    }

    public static int lastoccure(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastoccure(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        // int xnm1 = power(x, n - 1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n - 1);

    }

    public static int opptmizpower(int a, int n) {

        if (n == 0) {
            return 1;
        }

        // int halfpower;

        int halfPowersq = opptmizpower(a, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }

    public static void main(String[] args) {
        // int n = 25;
        // System.out.println(fib(n));
        // int arr[] = { 1, 2, 3, 6, 4 };

        // System.out.println(isshorted(arr, 0));

        // int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        // System.out.println(firstoccure(arr, 5, 0));
        // System.out.println(lastoccure(arr, 5, 0));
        // System.out.println(power(854, 10));

        int a = 2;
        int n = 10;

        System.out.println(opptmizpower(a, n));

    }
}
