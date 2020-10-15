import java.util.Scanner;



public class AverageArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];  //インデックスが１０までのアレイを作成

        System.out.println("enter ten double values: ");

        for(int i = 0; i < numbers.length; i++){  //タイプした１０個を一つづつインデックスに入れる
            numbers[i] = input.nextDouble();
        }

        // for(double number: numbers){    // インデックスに入れたものを表示させる(チェック)
        //     System.out.println(number);
        // }

        System.out.format("this is average of array :  %.3f", average(numbers));
        
        input.close();
        
    }

    


    public static double average(int[] array) {

        int sum = 0, counter = 0;


        for(int i: array) {
            sum += i;
            counter++;
        }

        return sum / counter;

    }

    public static double average(double[] array) {

        double sum = 0.0, counter = 0.0;


        for(double i: array) {
            sum += i;
            counter++;
        }

        return sum / counter;

    }

    

}
