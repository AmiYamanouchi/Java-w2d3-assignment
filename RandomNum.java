// import java.util.Scanner;
// import java.util.Arrays;
import java.lang.Math;

public class RandomNum {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //problem2
        //Write a method return random number between 1-54
        System.out.println("your added random number is" + getRandom(arr1));
    }

     //problem 2 

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

}

