

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestSmallestElement {
    public static int kthSmallest(int arr[], int k) {
        Arrays.sort(arr); // Sort array for correct order
        int distinctCount = 0, prev = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != prev) { // Count only distinct elements
                distinctCount++;
                if (distinctCount == k) {
                    return arr[i]; // Return Kth distinct smallest
                }
                prev = arr[i]; // Update previous element
            }
        }
        return -1; // Return -1 if K is invalid
    }

    public static int kthLargest(int arr[], int k) {
        Arrays.sort(arr); // Sort array for correct order
        int distinctCount = 0, prev = Integer.MAX_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != prev) { // Count only distinct elements
                distinctCount++;
                if (distinctCount == k) {
                    return arr[i]; // Return Kth distinct largest
                }
                prev = arr[i]; // Update previous element
            }
        }
        return -1; // Return -1 if K is invalid
    }

    public static int[] input_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = input_array();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kth smallest or largest element to find: ");
        int k = sc.nextInt();
        System.out.println("The " + k + "th smallest element is: " + kthSmallest(arr, k));
        System.out.println("The " + k + "th largest element is: " + kthLargest(arr, k));
    }
}
