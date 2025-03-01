// Problem statement: Given an array, we have found the number of occurrences of each element in the array.

// Examples:

// Example 1:
// Input: arr[] = {10,5,10,15,10,5};
// Output: 10  3
// 	 5  2
//         15  1
// Explanation: 10 occurs 3 times in the array
// 	      5 occurs 2 times in the array
//               15 occurs 1 time in the array

// Example2: 
// Input: arr[] = {2,2,3,4,4,2};
// Output: 2  3
// 	3  1
//         4  2
// Explanation: 2 occurs 3 times in the array
// 	     3 occurs 1 time in the array
//              4 occurs 2 time in the array



import java.util.Arrays;
import java.util.Scanner;

public class CountFrequency {
    public static int[] input_array(Scanner sc) {
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void countFreq(int arr[]) {
        int count = 1;
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " " + count);
                count = 1;
            }
        }
        // Print last element's frequency
        System.out.println(arr[arr.length - 1] + " " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = input_array(sc);
        sc.close();
        countFreq(arr);
    }
}
