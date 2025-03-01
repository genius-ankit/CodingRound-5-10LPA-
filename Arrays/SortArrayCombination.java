// Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayCombination{
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
        int arr[]=input_array();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = arr.length-1; i >= (arr.length)/2; i--) {
            System.out.print(arr[i]+ " ");
        }
    }

}