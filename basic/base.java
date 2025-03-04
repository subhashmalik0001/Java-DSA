import java.util.Scanner;

public class base {

    // public static int Sum(int num1, int num2){
    //     int sum = num1 + num2;
    //     return sum;
    // }

    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == key) {
        return i;
        }
        }
        return -1;
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        System.out.println("enter your key");
    int key = sc.nextInt();
    int index = linearsearch(numbers, key);
    if (index == -1) {
    System.out.println("NOT FOUND");
    } else {
    System.out.println("key is at :" + index);
    }


        
        sc.close();
    }
}
