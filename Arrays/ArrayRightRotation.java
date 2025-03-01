// Problem Statement: Given an array of n size, rotate the array by k elements using the Reversal Algorithm

// Rotate the array to the Right

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotation {
     public static int[] input_array() {
        System.out.print("Enter the size of the Array: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void arrRev(int arr[],int start,int end){
                while(start<end){
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
    }

    public static String leftRotation(int arr[], int k ){
        int n=arr.length;
        k=k%n;
        
        arrRev(arr, 0, n-1);
        arrRev(arr,0, k-1);
        arrRev(arr, k, n-1);

        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        int  arr[]=input_array();
        System.out.println(leftRotation(arr, 2));
       
    }
}
