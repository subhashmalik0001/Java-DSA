public class larg {

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
            
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 1, 100};
        System.out.println("your large number is" + getlargest(numbers));
    }
    
}
