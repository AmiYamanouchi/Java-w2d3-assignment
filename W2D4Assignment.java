import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class W2D4Assignment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /**** Arrays for every problems ****/
        /*Pro1*/ int[] arrBS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*Pro2*/ int[] arrRandom = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*Pro3*/ double[] arrAve = new double[10];
        /*Pro4*/ double[] arrMin = new double[10];
        
        /**** problem 1 ****/
        // Write a binary search algorithm method
        System.out.println("element is found at index : 1"+ binarySearch(arrBS, 5));

        /**** problem 2 ****/
        //return a random number between 1 and 54 that is not included in the array.
        System.out.println("your added random number is " + getRandom(arrRandom));

        /**** problem 3 ****/
        //Write two overloaded methods that return the average of an array.
        System.out.println("enter ten double values: ");
        for(int i = 0; i < arrAve.length; i++){  //タイプした１０個を一つづつインデックスに入れる
            arrAve[i] = input.nextDouble();
        }
        System.out.println("The average is " + average(arrAve));

        /**** problem 4 ****/
        //Write a method that finds the smallest element in an array of double values.
        System.out.println("enter ten double values: ");
        for(int i = 0; i < arrMin.length; i++){  //タイプした１０個を一つづつインデックスに入れる
            arrMin[i] = input.nextDouble();
        }
        System.out.println("the minNum is : " + min(arrMin));

        input.close();

    }

    /**** problem 1 ****/
    public static int binarySearch(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        
		while (start <= end) {
            
            int middle = (start + end) / 2;
			
			if (key < arr[middle]) {
				end = middle - 1;
			}

			if (key > arr[middle]) {
				start = middle + 1;
			}
			
			if (key == arr[middle]) {
                index = middle;
                break;
            }
            
        }
        
		return index;
    }

    /**** problem 2 ****/
    public static int getRandom(int[] arr) {

        while (true) {
            int ranNum = (int)(Math.random() * 15) + 1;
            int num = 0;

            // for(int i: arr)
            for(int i = 0; i < arr.length; i++) {
                if(ranNum == arr[i]) {
                    num++;
                }
            }

            if(num == 0) {
                return ranNum;
            } else {
                num = 0;
            }

        }

    }

    /**** problem 3 - 1 ****/

    public static double average(int[] array) {

        int sum = 0, counter = 0;


        for(int i: array) {
            sum += i;
            counter++;
        }

        return sum / counter;

    }

    /**** problem 3 - 2 ****/
    public static double average(double[] array) {

        double sum = 0.0, counter = 0.0;


        for(double i: array) {
            sum += i;
            counter++;
        }

        return sum / counter;

    }

    
    /**** problem 4 ****/
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
