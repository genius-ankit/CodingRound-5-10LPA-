// Problem Statement: Given an array, we have to find the sum of all the elements in the array.

import java.util.Scanner;

public class ArraySum{
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

    public static int arraysum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
   public static void main(String[] args) {
   int arr[]=input_array();
   System.out.print("sum of all  elements of the array is : " + arraysum(arr));



   }

}