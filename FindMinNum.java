import java.util.Scanner;

public class FindMinNum {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("enter ten double values: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        System.out.println("the minNum is : " + min(numbers));

        input.close();


    }

    public static double min(double[] arr) {

        double min = arr[0];

        for(double i : arr) {
            if(i < min) {
                min = i;
            }
        }

        return min;

    }


    
}
