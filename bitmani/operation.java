package bitmani;

public class operation {
    public static int getithbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbit(int n, int i) {
        int bitmAsk = 1 << i;
        return n | bitmAsk;
    }

    public static int clearithbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(getithbit(5, 2));
        // System.out.println(setithbit(10, 2));
        System.out.println(clearithbit(10, 1));

    }

}
