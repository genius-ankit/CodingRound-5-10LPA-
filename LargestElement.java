// Problem Statement: Given an array, we have to find the largest element in the array.

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class LargestElement {
    public static int[] input_array(){
            System.out.print("Enter the size of the Array : ");
            Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter the elements of the array :  ");
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
            return arr;
            }
            public static int findMax(int arr[]){
                // Arrays.sort(arr);
                // return arr[arr.length-1];
                int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                
            }
        }
        return max;
    }

    

    public static void main(String[] args) {
        int arr[]=input_array();
        int max=findMax(arr);
        System.out.println("largest element in the array is : " + max);

        
            }
        
    
    
}
