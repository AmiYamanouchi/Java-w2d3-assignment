// import java.util.Scanner;
// import java.lang.Math;
import java.lang.String;

public class BinarySearch {


    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //problem1
        // Write a binary search algorithm method

        System.out.println("element is found at index :"+ binarySearch(arr1, 5));

        
    }


    //methods for problems

    //problem1
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

     

    

}